package src;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * メルセンヌ数を求めるクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class MersenneNumbers extends Object
{
    /**
     * メルセンヌ数で計算する範囲を指定するフィールド
     */
    private Integer aNumber = 127;

    /**
     * 2の累乗を示す連想表を作るフィールド
     */
    final List<BigInteger> aList = new ArrayList<BigInteger>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public MersenneNumbers(String[] arguments){
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「127」とします");
        } else{
            this.aNumber = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 2の累乗を求めるメソッド
     * @param aNumber 累乗値
     */
    public BigInteger powerOfTwo(Integer aNumber)
    {
        return this.aList.get(aNumber - 1).multiply(BigInteger.valueOf(2));
        
    }

    /**
     * 発展プログラミング演習 小テスト5のメインプログラム
     */
    public void run()
    {
        this.aList.add(BigInteger.valueOf(1));

        //連想表の作成
        IntStream.rangeClosed(1, this.aNumber).forEach( index -> {
            this.aList.add(this.powerOfTwo(index));
        });

        Print aPrint = new Print();

        //連想表の表示
        IntStream.rangeClosed(0, this.aNumber).forEach( index -> {
            aPrint.printAnswer(index, this.aList.get(index).subtract(BigInteger.valueOf(1)));
        });

    }
}
