package src;

/**
 * 問題
 * 2次方程式の解を解の公式を用いて求めるプログラム作成してください． 
 * その際，実数解，重解，虚数解を区別して出力するようにしましょう． 
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題3-3のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        QuadraticEquation aQuadraticEquation = new QuadraticEquation(arguments);
        aQuadraticEquation.run();
    }
}
