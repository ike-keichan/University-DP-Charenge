package src;

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 小テスト5のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        MersenneNumbers aMersenneNumbers = new MersenneNumbers(arguments);
        aMersenneNumbers.run();
	}
}