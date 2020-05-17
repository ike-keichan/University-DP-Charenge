package src;

/**
 * メインクラス
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