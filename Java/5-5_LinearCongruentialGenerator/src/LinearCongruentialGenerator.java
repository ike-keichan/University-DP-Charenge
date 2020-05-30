package src;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Fibonacciを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class LinearCongruentialGenerator extends Object
{
    /**
     * 取得する乱数の数を格納するフィールド
     */
    private Integer count = 10;

    /**
     * 乱数を格納するフィールド
     */
    private List<Double> randomList = new ArrayList<Double>();

    /**
     * 定数Aを表すフィールド
     */
    final private Double numberA = 908.0;

    /**
     * 定数Bを表すフィールド
     */
    final private Double numberB = 1.0;

    /**
     * 定数Mを表すフィールド
     */
    final private Double numberM = 65535.0;

    /**
     * Xを表すフィールド
     */
    private Double numberX = 21.0;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public LinearCongruentialGenerator(String[] arguments){
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「10」とします");
        } else{
            this.count = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 乱数表を作成し、取得するメソッド
     * @param aNumber 取得する乱数の数
     */
    public List<Double> getRandomList(Integer aNumber)
    {
        IntStream.range(0, aNumber).forEach(index -> {
            this.numberX = ((this.numberX * this.numberA + this.numberB) % this.numberM) / this.numberM;
            this.randomList.add(Double.valueOf(this.numberX));
        });

        return this.randomList;
    }

    /**
     * 発展プログラミング演習 練習問題5-5のメインプログラム
     */
    public void run()
    {
        System.out.println(this.getRandomList(this.count));
    }
}
