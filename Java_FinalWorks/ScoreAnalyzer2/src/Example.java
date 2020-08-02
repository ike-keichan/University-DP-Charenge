package src;

/**
 * テスト入力を行う例題クラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Example extends Object
{
	/**
     * 発展プログラミング演習 最終課題STEP2のメインメソッド
     * @param arguments 引数の文字列の配列
     */
	public static void main(String... arguments)
	{
		ScoreAnalyzer2 aScoreAnalyzer2 = new ScoreAnalyzer2();
		aScoreAnalyzer2.run("csv/reading.csv");
		aScoreAnalyzer2.run("csv/writing.csv");

		return;
	}
}