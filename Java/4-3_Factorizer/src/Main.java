package src;

/**
 * 問題
 * コマンドライン引数で与えられた整数値の素因数分解を行ってください
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
   /**
     * 発展プログラミング演習 練習問題4-3のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        Factorizer aFactorizer = new Factorizer(arguments);
        aFactorizer.run();
    }
}
