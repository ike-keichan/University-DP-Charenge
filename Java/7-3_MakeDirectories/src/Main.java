package src;

/**
 * 問題
 * 先ほどの MakeDirectory は途中のディレクトリが存在しないとき， ディレクトリの作成に失敗しました．
 * そのような場合でもディレクトリが作成できるようにしましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題7-3のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		MakeDirectories aMakeDirectories = new MakeDirectories(arguments);
        aMakeDirectories.run();
	}
}
