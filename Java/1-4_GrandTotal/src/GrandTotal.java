package src;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * 総和を求めるクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class GrandTotal extends Object
{
    /**
     * 総和を格納するフィールド
     */
    private Integer sum = 0;

    /**
     * 加算しつつ、引数をそのまま返す関数
     */
    private IntUnaryOperator calculate = (aNumber) -> {
        this.sum += aNumber;
        return aNumber;
    };

    /**
     * 発展プログラミング演習 練習問題1-4の出力プログラム。
     * @param aNumber 最後に加算した値
     */
    private void print(Integer aNumber)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("1から");
        aBuffer.append(aNumber);
        aBuffer.append("までの総和は");
        aBuffer.append(this.sum);
        aBuffer.append("です.");
        System.out.println(aBuffer.toString());

        return;
    }

    /**
     * 発展プログラミング演習 練習問題1-4の起動プログラム
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //　それぞれの総和を表示
        IntStream.rangeClosed(1, 10)
            .map(this.calculate)
            .forEach(this::print);

        return;
    }
}
