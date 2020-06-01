package src;

/**
 * 問題
 * コマンドライン引数で与えられた値までの素数を出力してください． 
 * なお，素数を10個出力するごとに改行を入れてください． 
 * コマンドライン引数で値が指定されなかった場合は，200までの素数を求めましょう．
 * 素数を求めるには，エラトステネスのふるいを使うと良いでしょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題4-2のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        Primes aPrimes = new Primes(arguments);
        aPrimes.run();
    }
}
