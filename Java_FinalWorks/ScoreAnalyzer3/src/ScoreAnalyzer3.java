package src;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 発展プログラミング演習 最終課題STEP3のクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class ScoreAnalyzer3 extends Object
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
	 * 学生ごとの点数を格納するフィールド
	 */
	private Map<Integer, ArrayList<String>> studentsScoresMap;

	/**
	 * 問題番号を格納するフィールド
	 */
	private List<Integer> problemNumbersList;

	/**
	 * 学生番号を格納するフィールド
	 */
	private List<Integer> studentNumbersList;

	/**
	 * 発展プログラミング演習 最終課題STEP3の起動メソッド
	 * @param aString 引数の文字列
	 */
	public void run(String aString)
	{
		this.csvFileName = aString;
		this.studentsScoresMap = new HashMap<Integer, ArrayList<String>>(); //初期化
		this.readCsv();
		this.createProblemNumbersList();
		this.createStudentNumbersList();
		this.createStudentsScoresMap();
		this.printHead();
		this.printResult();
		this.printBottom("最大値");
		this.printBottom("最小値");
		this.printBottom("平均値");

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
	 * 問題番号のリスト"problemNumbersList"を構築するメソッド
	 * 用意されたcsvファイルを入力とした場合、要素が1~5のInteger型のArrayListができる。
	 */
	public void createProblemNumbersList()
	{
		this.problemNumbersList = new ArrayList<Integer>(); //初期化
		this.aDataList.stream()
			.map(aData -> aData.getProblemNumber())
			.distinct()
			.sorted()
			.forEach(this.problemNumbersList::add);

		return;
	}

	/**
	 * 学生番号のリスト"studentNumbersList"を構築するメソッド
	 * 用意されたcsvファイルを入力とした場合、要素が1~144のInteger型のArrayListができる。
	 */
	public void createStudentNumbersList()
	{
		this.studentNumbersList = new ArrayList<Integer>(); //初期化
		this.aDataList.stream()
			.map(aData -> aData.getStudentNumber())
			.distinct()
			.sorted()
			.forEach(this.studentNumbersList::add);

		return;
	}

	/**
	 * 「学生番号」と「試験の点数のリスト」を紐づけるstudentScoresMapを構築するメソッド
	 * 用意されたcsvファイルを入力とした場合、「学生番号1~144の学生」に対して、「問題1~5の点数のリスト」が紐づけられる。
	 * また、未受験の場合は自動的に空文字「」を入力する。
	 */
	public void createStudentsScoresMap()
	{
		//学生番号のループ
		this.studentNumbersList.forEach(studentNumber -> 
		{
			//初期化、点数のリストを構築する。
			ArrayList<String> scoresList = new ArrayList<String>();
			//問題番号のループ
			this.problemNumbersList.forEach(problemNumber -> 
			{
				//csvファイルの内容を格納したリストをループし、学生番号と問題番号の両方にマッチした要素の試験の点数を点数リストに追加。
				this.aDataList.stream()
					.filter(aData -> aData.getStudentNumber().equals(studentNumber))
					.filter(aData -> aData.getProblemNumber().equals(problemNumber))
					.forEach(aData -> scoresList.add(aData.getScore()));

				//csvファイルの内容を格納したリストをループし、学生番号と問題番号の両方にマッチしなかった場合、falseを返す。
				Boolean flag = this.aDataList.stream()
					.filter(aData -> aData.getStudentNumber().equals(studentNumber))
					.noneMatch(aData -> aData.getProblemNumber().equals(problemNumber));

				//未受験の場合は自動的に空文字「」を入力する。
				if(flag){ scoresList.add(""); }
			});
			this.studentsScoresMap.put(studentNumber, scoresList);
		});
		
		return;
	}


	/**
	 * 出力する結果のヘッドを標準出力するメソッド
	 */
	public void printHead()
	{
		final StringBuffer aBuffer = new StringBuffer();
		aBuffer.append("学生ID| ");
		this.problemNumbersList.forEach(item -> aBuffer.append(String.format("課題%dの点数| ", item)));
		aBuffer.append("最大値| ");
		aBuffer.append("最小値| ");
		aBuffer.append("平均点|");
		Printer aPrinter = new Printer();
		aPrinter.perform(aBuffer.toString());

		return;
	}

	/**
	 * 結果を標準出力するメソッド
	 */
	public void printResult() 
	{
		Calculation aCalculation = new Calculation();
		Printer aPrinter = new Printer();
		this.studentsScoresMap.forEach((key, value) -> {
			final StringBuffer aBuffer = new StringBuffer();
			aBuffer.append(String.format("%6s|", key));
			value.forEach(item -> aBuffer.append(String.format("%12s|", item)));
			aBuffer.append(String.format("%7s|", aCalculation.maxScore(value)));
			aBuffer.append(String.format("%7s|", aCalculation.minScore(value)));
			aBuffer.append(String.format("%7s|", aCalculation.averageScore(value)));
			aPrinter.perform(aBuffer.toString());
		});

		return;
	}

	/**
	 * 出力する結果のボトムを標準出力するメソッド
	 * @param aString 引数の文字列
	 */
	public void printBottom(String aString)
	{
		Calculation aCalculation = new Calculation();
		Printer aPrinter = new Printer();
		StringBuffer aBuffer = new StringBuffer();
		this.problemNumbersList.forEach(problemNumber -> 
		{
			aBuffer.append(String.format("課題%dの%s：", problemNumber, aString));
			if(aString.equals("最大値")){
				aBuffer.append(String.format("%7.6f", aCalculation.maxScore(this.aDataList, problemNumber)));
			}else if(aString.equals("最小値")) {
				aBuffer.append(String.format("%7.6f", aCalculation.minScore(this.aDataList, problemNumber)));
			}else if(aString.equals("平均値")){
				aBuffer.append(String.format("%7.6f", aCalculation.averageScore(this.aDataList, problemNumber)));
			}
			if(!problemNumber.equals(this.problemNumbersList.size())){ aBuffer.append(", "); }
		});
		aPrinter.perform(aBuffer.toString());

		return;
	}
}
