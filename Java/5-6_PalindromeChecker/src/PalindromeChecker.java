package src;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 回文を判定するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class PalindromeChecker extends Object
{     
    /**
     * 判定する文字列を格納するフィールド
     */
    private String aString = "しんぶんし";

    /**
     * 反転させた文字列を格納するフィールド
     */
    private String reversedString = "";

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public PalindromeChecker(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length == 0) {
            System.out.println("入力がなかったため、コマンドライン引数を「しんぶんし」とします");
        } else {
            this.aString = String.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 練習問題5-6の起動プログラム
     */
    public void run()
    {
        IntStream.range(0, this.aString.length())
            .boxed()                            //IntegerのStreamに変形
            .sorted(Comparator.reverseOrder())  //逆順ソート
            .forEach( index -> {
                this.reversedString = this.reversedString + this.aString.charAt(index);
            });

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printAnswer(this.reversedString, this.reversedString.equals(this.aString));
    }
}
