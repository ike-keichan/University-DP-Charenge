package src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 発展プログラミング演習 最終課題STEP1のクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class ScoreAnalyzer1 extends Object
{
	/**
	 * 問題番号を格納するフィールド
	 */
	private Integer problemNumber;

	/**
	 * csvファイル名を格納するフィールド
	 */
	private String csvFileName;

	/**
	 * csvファイルの内容を格納するフィールド
	 */
	private List<DataTable> aDataList;

	/**
	 * 点数割合を格納するフィールド
	 */
	private Map<String, Integer> scoreRate = new HashMap<String, Integer>();

	/**
	 * 発展プログラミング演習 最終課題STEP1の起動メソッド
	 * @param aNumber 引数の整数
	 * @param aString 引数の文字列
	 */
	public void run(Integer aNumber, String aString)
	{
		this.problemNumber = aNumber;
		this.csvFileName = aString;
		this.scoreRate = new HashMap<String, Integer>();
		this.readCsv();
		System.out.printf("目的の問題番号は「%s」になります。%n", problemNumber);
		this.checkData();

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
	 * 読み込んだデータから特定の問題数の各点数を取った人数などを求めるメソッド
	 */
	public void checkData()
	{
		aDataList.stream()
			.filter(aData -> aData.getProblemNumber() == this.problemNumber)
			.forEach(aData -> {
				try
				{
					this.scoreRate.put(aData.getScore(), this.scoreRate.get(aData.getScore()) + 1);
				}
				catch(NullPointerException anException) { this.scoreRate.put(aData.getScore(), 1); }
		});
		this.printResult();

		return;
	}

	/**
	 * 結果を標準出力するメソッド
	 */
	public void printResult() 
	{
		Printer aPrinter = new Printer();
		Integer examineeCount = (int) aDataList.stream()
			.filter(aData -> aData.getProblemNumber() == this.problemNumber).count();

		this.scoreRate.entrySet().forEach(item -> {
			aPrinter.perform(item.getKey(), item.getValue(), examineeCount);
		});

		return;
	}

}
