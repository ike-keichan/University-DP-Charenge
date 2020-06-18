package src;

/**
 * 問題
 * ディレクトリを作成するコマンド MakeDirectory を作成しましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題7-2のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		MakeDirectory aMakeDirectory = new MakeDirectory(arguments);
        aMakeDirectory.run();
	}
}
