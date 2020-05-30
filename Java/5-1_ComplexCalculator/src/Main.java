package src;

/**
 * 問題
 * Complex型に四則演算を行うメソッドを追加してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題5-1のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        ComplexCalculator aComplexCalculator = new ComplexCalculator(arguments);
        aComplexCalculator.run();
    }
}
