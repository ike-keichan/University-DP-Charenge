package src;

/**
 * メインクラス
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 小テスト１のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        NameReverser aNameReverser = new NameReverser(arguments);
        aNameReverser.run();
	}

}