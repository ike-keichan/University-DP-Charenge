package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * csvファイルの読み込みを行うクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Reader extends Object
{
	/**
	 * csvファイルの内容を格納するフィールド
	 */
	private List<DataTable> aList = new ArrayList<DataTable>();

	/**
	 * csvファイルの読み込みを行うメソッド
	 * @param csvFileName 読み込みを行うcsvファイル名
	 * @return aList csvファイルの内容を格納したリスト
	 */
	public List<DataTable> perform(String csvFileName)
	{
		String currentDirectory = System.getProperty("user.dir");
		System.out.printf("カレントディレクトリは「%s」です。%n", currentDirectory);

		String csvFilePathName = currentDirectory.concat(File.separator.concat(csvFileName));
		System.out.printf("目的のCSVファイルは「%s」になります。%n", csvFilePathName);

		try
		{
			// バイト単位アクセス
			FileInputStream fileInputStream = new FileInputStream(csvFilePathName);
			// 文字単位アクセス
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			// バッファを作り、高速アクセスを可能にする
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String aString = null;
			while ((aString = bufferedReader.readLine()) != null)
			{
				String[] anArray = aString.split("[,]");
				DataTable aDataTable = new DataTable(anArray);
				this.aList.add(aDataTable);
			}

			bufferedReader.close();
		}
		catch (FileNotFoundException anException) { anException.printStackTrace(); }
		catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
		catch (IOException anException) { anException.printStackTrace(); }

		return this.aList;
	}

}
