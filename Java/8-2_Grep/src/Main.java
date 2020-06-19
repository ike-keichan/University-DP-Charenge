package src;

/**
 * 問題
 * ここでは，grepコマンドを作成しましょう．
 * grepコマンドとは， キーワードと１つ以上のファイル名が与えられます． 
 * ファイルの行にキーワードが含まれていれば，その行を出力するコマンドです．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題8-2のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		Grep aGrep = new Grep(arguments);
        aGrep.run();
	}
}
