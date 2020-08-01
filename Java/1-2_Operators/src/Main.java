package src;

/**
 * 問題
 * 2つの変数の四則演算+剰余を求めるプログラムを作成しましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題1-2のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        Operators aOperators = new Operators(arguments);
        aOperators.run();
	}

}