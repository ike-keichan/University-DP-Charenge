package src;

/**
 * 問題
 * 台形公式を用いてπを計算してください． 
 * まず，半径1の円を表す式x2＋y2＝1を考えましょう． 
 * 式を変形すると，y=1−x2‾‾‾‾‾‾√となります． 
 * これの0≤x≤1の範囲を考えます．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題3-5のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        TrapezoidalRulePi aTrapezoidalRulePi = new TrapezoidalRulePi(arguments);
        aTrapezoidalRulePi.run();
    }
}
