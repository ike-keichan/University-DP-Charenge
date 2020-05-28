package src;

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
