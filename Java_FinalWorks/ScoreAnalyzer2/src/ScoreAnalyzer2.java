package src;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 発展プログラミング演習 最終課題STEP2のクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class ScoreAnalyzer2 extends Object
{
	/**
	 * csvファイル名を格納するフィールド
	 */
	private String csvFileName;

	/**
	 * csvファイルの内容を格納するフィールド
	 */
	private List<DataTable> aDataList;

	/**
	 * 出現した点数の種類を格納するフィールド
	 */
	private List<String> scoresList;

	/**
	 * 点数割合を格納するフィールド
	 */
	private Map<String, Integer> scoreRate = new HashMap<String, Integer>();

	/**
	 * 発展プログラミング演習 最終課題STEP2の起動メソッド
	 * @param aString 引数の文字列
	 */
	public void run(String aString)
	{
		this.csvFileName = aString;
		this.scoresList = new ArrayList<String>(); //初期化
		this.readCsv();
		this.createScoresList();
		this.printHead();
		IntStream.rangeClosed(1, 5).forEach(this::checkData);

		return;
	}

	/**
	 * csvファイルの読み込みを行うメソッド
	 */
	public void readCsv()
	{
		Reader aReader = new Reader();
		this.aDataList = aReader.perform(this.csvFileName);

		return;
	}

	/**
	 * scoresListを構築するメソッド
	 */
	public void createScoresList()
	{
		this.aDataList.forEach(aData -> {
			if(!this.scoresList.contains(aData.getScore())){ this.scoresList.add(aData.getScore());}
		});
		//文字列の標準ソート
		Collections.sort(this.scoresList);
		//文字列の長さでソート
		Collections.sort(this.scoresList, (s1, s2) -> s1.length() - s2.length());
		// this.scoresList.forEach(System.out::println); //デバック用

		return;
	}

	/**
	 * 読み込んだデータから特定の問題数の各点数を取った人数などを求めるメソッド
	 * @param problemNumber 問題番号
	 */
	public void checkData(Integer problemNumber)
	{
		this.scoreRate = new HashMap<String, Integer>(); //初期化
		this.aDataList.stream()
			.filter(aData -> aData.getProblemNumber() == problemNumber)
			.forEach(aData -> {
				try
				{
					this.scoreRate.put(aData.getScore(), this.scoreRate.get(aData.getScore()) + 1);
				}
				catch(NullPointerException anException) { this.scoreRate.put(aData.getScore(), 1); }
		});
		// this.scoreRate.entrySet().forEach(System.out::println); //デバック用
		this.printResult(problemNumber);

		return;
	}

	/**
	 * 出力する結果のヘッドを標準出力するメソッド
	 */
	public void printHead()
	{
		final StringBuffer aBuffer = new StringBuffer();
		this.scoresList.forEach(item -> {
			aBuffer.append(String.format("%7s", item));
			if(!item.equals(this.scoresList.get(this.scoresList.size() - 1))){ aBuffer.append(" , "); }
		});
		Printer aPrinter = new Printer();
		aPrinter.perform(" ", aBuffer.toString());

		return;
	}

	/**
	 * 結果を標準出力するメソッド
	 * @param problemNumber 問題番号
	 */
	public void printResult(Integer problemNumber) 
	{
		Integer examineeCount = (int) aDataList.stream()
			.filter(aData -> aData.getProblemNumber() == problemNumber).count();	
		final StringBuffer aBuffer = new StringBuffer();
		this.scoresList.forEach(index -> {
			try
			{
				aBuffer.append(String.format("%7.3f", (double)this.scoreRate.get(index)/examineeCount*100));
				if(!index.equals(this.scoresList.get(this.scoresList.size() - 1))){ aBuffer.append(" , "); }
			}
			catch(NullPointerException anException){ aBuffer.append(String.format("%7.3f", 0.0)); aBuffer.append(" , "); }
		});
		Printer aPrinter = new Printer();
		aPrinter.perform(String.format("%2d", problemNumber), aBuffer.toString());

		return;
	}

}
