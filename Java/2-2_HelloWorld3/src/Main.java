package src;

/**
 * 問題
 * コマンドライン引数で与えられた人に，挨拶しましょう． 
 * 基本的には，HelloWorld 改と同じですが，もし， "World"が指定されたら，"Hi, World"と気さくに挨拶してください． 
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題2-2のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        HelloWorld3 aHelloWorld3 = new HelloWorld3(arguments);
        aHelloWorld3.run();
	}

}
