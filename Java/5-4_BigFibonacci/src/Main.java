package src;

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題5-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        BigFibonacci aBigFibonacci = new BigFibonacci(arguments);
        aBigFibonacci.run();
	}
}
