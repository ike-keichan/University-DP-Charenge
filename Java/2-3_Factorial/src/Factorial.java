package src;

import java.util.stream.IntStream;

/**
 * 階乗を求めるクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class Factorial extends Object
{
    /**
     * 入力された値を格納するフィールド
     */
    private Integer aNumber = 10;

    /**
     * 計算結果を格納するフィールド
     */
    private Integer resultNumber = 1;

    /**
     * コンストラクタ
     * @param arguments
     */
    public Factorial(String[] arguments)
    {
        if(arguments.length == 0){ System.out.println("入力がなかったため、コマンドライン引数を「10」とします"); }
        this.aNumber = (arguments.length == 0) ? 10 : Integer.valueOf(arguments[0]);
    }

    /**
     * 発展プログラミング演習 練習問題2-3の起動プログラム。
     */
    public void run()
    {
        IntStream.rangeClosed(1, this.aNumber).forEach( index -> {
            this.resultNumber = this.resultNumber * index;
        });

        //文字列連結と出力
        StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(this.aNumber);
        aBuffer.append("! = ");
        aBuffer.append(this.resultNumber);
        System.out.println(aBuffer.toString());

    }
}
