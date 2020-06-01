package src;

/**
 * 問題
 * 0から1までの Double 型の乱数を発生させ，その値が0.5より小さければ Small，0.5以上であれば Big と出力するプログラムを作成してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda\
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題1-1のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        BigAndSmall aBigAndSmall = new BigAndSmall();
        aBigAndSmall.run(arguments);
	}

}