package src;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Fibonacciを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class FibonacciList extends Object
{
    /**
     * フィボナッチ数列で計算するフィールド
     */
    private Integer aNumber = 10;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public FibonacciList(String[] arguments){
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「10」とします");
        } else{
            this.aNumber = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 小テスト4のメインプログラム
     */
    public void run()
    {
        //連想表の宣言
        final List<BigInteger> aList = new ArrayList<BigInteger>();
        aList.add(BigInteger.valueOf(0));
        aList.add(BigInteger.valueOf(1));

        //連想表の作成
        IntStream.rangeClosed(2, this.aNumber).forEach( index -> {
            aList.add(aList.get(index-1).add(aList.get(index-2)));
        });

        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("[");

        //連想表の表示
        IntStream.rangeClosed(0, this.aNumber).forEach( index -> {
            aBuffer.append(aList.get(index));
            if(index != this.aNumber){ aBuffer.append(", "); }
        });

        aBuffer.append("]");
        System.out.println(aBuffer.toString());

    }
}
