package src;

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
