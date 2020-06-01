package src;

/**
 * 問題
 * 0以上，1000未満の乱数を100個取得してください． 
 * それらの合計値，最大値，最小値，平均を求めてください． 
 * 出力は，まず，合計，最大値，最小値，平均を１行で出力してください． 
 * その次に，得られた乱数値を出力してください．
 * ただし，10個出力するごとに改行を入れてください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題4-1のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        StatsValues aStatsValues = new StatsValues();
        aStatsValues.run(arguments);
    }
}
