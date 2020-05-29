package src;

import java.util.stream.IntStream;

/**
 * 総和を求めるクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class GrandTotal extends Object
{
    /**
     * 総和を格納するフィールド
     */
    private Integer sum = 0;

    /**
     * 発展プログラミング演習 練習問題1-4の起動プログラム
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //　それぞれの総和を表示
        IntStream.range(1, 11).forEach( aNumber -> {
            this.sum += aNumber;
            //出力
            final StringBuffer aBuffer = new StringBuffer();
            aBuffer.append("1から");
            aBuffer.append(aNumber);
            aBuffer.append("までの総和は");
            aBuffer.append(this.sum);
            aBuffer.append("です.");
            System.out.println(aBuffer.toString());
        });
    }

}
