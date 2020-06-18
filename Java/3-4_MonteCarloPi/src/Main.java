package src;

/**
 * 問題
 * モンテカルロ法により，πを計算しましょう． 
 * モンテカルロ法とは，乱数を用いて統計計算を行う方法です． 
 * ここでは，πを求めます．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題3-4のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        MonteCarloPi aMonteCarloPi = new  MonteCarloPi(arguments);
        aMonteCarloPi.run();
    }
}
