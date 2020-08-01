package src;

/**
 * テスト入力を行う例題クラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Example extends Object
{
	/**
     * 発展プログラミング演習 最終課題STEP1のメインメソッド
     * @param arguments 引数の文字列の配列
     */
	public static void main(String... arguments)
	{
		ScoreAnalyzer1 aScoreAnalyzer1 = new ScoreAnalyzer1();
		aScoreAnalyzer1.run(1, "csv/reading.csv");
		aScoreAnalyzer1.run(2, "csv/reading.csv");
		aScoreAnalyzer1.run(4, "csv/reading.csv");
		aScoreAnalyzer1.run(5, "csv/writing.csv");

		return;
	}
}
