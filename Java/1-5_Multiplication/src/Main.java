package src;

/**
 * 問題
 * 出力例のように，九九を表示するプログラムを作成しましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題1-5のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		Multiplication aMultiplication = new Multiplication();
		aMultiplication.run(arguments);
	}

}
