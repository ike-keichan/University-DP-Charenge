package src;

/**
 * 問題
 * ループを用いて，1から10までの総和(10を含む)を求めましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題1-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		GrandTotal aGrandTotal = new GrandTotal();
		aGrandTotal.run(arguments);
	}

}
