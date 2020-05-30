package src;

/**
 * 問題
 * コマンドライン引数で与えられた文字列（複数指定可）が回文（palindrome）であるかどうかを確認するプログラムを作成してください． 
 * 回文とは，始めから読んだ場合と終わりから読んだ場合とで，文字の出現する順番が同じである文字列のことを指します 
 * （本来は意味の通じるように，という条件もありますが，プログラムでは判断するのは難しいので，意味については関知しないものとします）．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題5-6のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        PalindromeChecker aPalindromeChecker = new PalindromeChecker(arguments);
        aPalindromeChecker.run();
	}
}
