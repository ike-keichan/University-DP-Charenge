package src;

/**
 * 問題
 * FizzBuzz は1から特定の値までの数値を順に出力します． 
 * ただし，3の倍数の時は，数値の代わりに Fizz という文字列を， 5の倍数の時は，数値の代わりに Buzz という文字列を， 
 * 3と5の公倍数の時は，数値の代わりに FizzBuzz という文字列を出力します． 
 * クラス名は，FizzBuzzとしてください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題2-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        FizzBuzz aFizzBuzz = new FizzBuzz(arguments);
        aFizzBuzz.run();
	}
}
