package src;

/**
 * 問題
 * コマンドライン引数で与えられた人に，挨拶しましょう． 
 * もし，誰も指定されない場合は，"Hello, World"と出力してください． 
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題2-1のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        HelloWorld2 aHelloWorld2 = new HelloWorld2(arguments);
        aHelloWorld2.run();
	}

}
