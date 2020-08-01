package src;

import java.util.function.Predicate;

/**
 * 閏年を判定するクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class LeapYear extends Object
{
    /**
     * 判定する年を格納するフィールド
     */
    private Integer year = 2020;

    /**
     * 閏年判定の関数
     */
    private Predicate<Integer> leapYear = (year) -> (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public LeapYear(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length == 0) { System.out.println("入力がなかったため、コマンドライン引数を「2020」とします"); } 
        this.year = (arguments.length == 0) ? 2020 : Integer.valueOf(arguments[0]);
    }

    /**
     * 発展プログラミング演習 練習問題1-3の起動プログラム
     */
    public void run()
    {
        String aString = (leapYear.test(this.year)) ?  "年はうるう年です．" : "年はうるう年ではありません．";
        System.out.println(this.year + aString);

        return;
    }
}
