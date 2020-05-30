package src;

/**
 * 問題
 * 第２回目の練習問題 5. Fibonacci数列を 再帰呼び出しを使って計算してみましょう． 
 * Fibonacci数列のn項目の値を出力してください．
 * コマンドライン引数に値が指定されない場合は，10項目が指定されたものとしてください． 
 * コマンドライン引数に複数個の数値が与えられた場合，全ての数値に対して結果を出力してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題5-3のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        Fibonacci2 aFibonacci2 = new Fibonacci2(arguments);
        aFibonacci2.run();
	}
}
