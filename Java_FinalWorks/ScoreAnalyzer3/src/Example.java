package src;

/**
 * テスト入力を行う例題クラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Example extends Object
{
	/**
     * 発展プログラミング演習 最終課題STEP3のメインメソッド
     * @param arguments 引数の文字列の配列
     */
	public static void main(String... arguments)
	{
		ScoreAnalyzer3 aScoreAnalyzer3 = new ScoreAnalyzer3();
		aScoreAnalyzer3.run("csv/reading.csv");
		aScoreAnalyzer3.run("csv/writing.csv");

		return;
	}
}
