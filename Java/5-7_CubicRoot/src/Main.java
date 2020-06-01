package src;

/**
 * 問題
 * ニュートン法による平方根の計算を参考に立方根を求めてください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題5-7のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		CubicRoot aCubicRoot = new CubicRoot(arguments);
        aCubicRoot.run();
	}
}
