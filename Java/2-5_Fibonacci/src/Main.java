package src;

/**
 * 問題
 * ibonacci数列とは，次の漸化式で表される数列です． 
 * このFibonacci数列を初項からコマンドライン引数で指定された項まで出力してみましょう． 
 * コマンドライン引数が指定されなかった場合は，20項目（20項も出力結果に含む）までを出力するようにしてください． 
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題2-5のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        Fibonacci aFibonacci = new Fibonacci(arguments);
        aFibonacci.run();
	}
}
