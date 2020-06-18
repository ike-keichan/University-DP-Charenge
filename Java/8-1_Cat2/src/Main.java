package src;

/**
 * 問題
 * 行番号付きで出力する cat コマンドを作成してください． 
 * クラス名はCat2としてください． 
 * ただし，例題1と異なり，複数のファイルを指定できるようにしましょう． 
 * この例題でも，引数は必ず与えられるものとしてください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題8-1のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		Cat2 aCat2 = new Cat2(arguments);
        aCat2.run();
	}
}
