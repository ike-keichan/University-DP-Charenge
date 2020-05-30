package src;

/**
 * 問題
 * 第１回目の練習問題 4. 総和を求めるを 再帰呼び出しを使って計算するプログラムを作成してください． 
 * また，コマンドライン引数で最大値を与えられるようにしてください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題5-2のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		GrandTotal2 aGrandTotal2 = new GrandTotal2(arguments);
		aGrandTotal2.run();
	}

}
