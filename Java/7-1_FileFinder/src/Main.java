package src;

/**
 * 問題
 * 指定されたディレクトリ以下の特定の名前をもつファイルが存在するかを探索するプログラムを作成してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題7-1のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		FileFinder aFileFinder = new FileFinder(arguments);
        aFileFinder.run();
	}
}
