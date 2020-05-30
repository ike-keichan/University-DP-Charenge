package src;

/**
 * 問題
 * 第２回目の練習問題 5. Fibonacci数列を改良し，桁あふれを起こさないようにしてください．
 * 再帰呼び出しではなく，単純な繰り返しでFibonacci数列のn項目を求めてください（単純な再帰呼び出しにすると，非常に遅くなるため）．
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
	 * 発展プログラミング演習 練習問題5-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        BigFibonacci aBigFibonacci = new BigFibonacci(arguments);
        aBigFibonacci.run();
	}
}
