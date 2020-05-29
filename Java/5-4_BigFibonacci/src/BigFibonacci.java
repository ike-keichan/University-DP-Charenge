package src;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * BigInterを用いて、桁溢れに対応させたプログラムである。
 * しかし、計算速度や負荷を考えた場合、「2-5_Fibonacci」の方が最適なプログラムであると言える。
 * こちらはけた溢れにも対応しており、連想表を構築しており、much better!
 */

/**
 * Fibonacciを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class BigFibonacci extends Object
{
    /**
     * フィボナッチ数列で計算するフィールド
     */
    private List<Integer> aList = new ArrayList<Integer>();

    /**
     * BigInteger型の0を格納するフィールド
     */
    final private BigInteger zero = new BigInteger("0");

    /**
     * BigInteger型の1を格納するフィールド
     */
    final private BigInteger one = new BigInteger("1");

    /**
     * BigInteger型の2を格納するフィールド
     */
    final private BigInteger two = new BigInteger("2");

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public BigFibonacci(String[] arguments){
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「10」とします");
            this.aList.add(10);
        } else{
            IntStream.range(0, arguments.length).forEach(index -> {
                this.aList.add(Integer.valueOf(arguments[index]));
            });
        }
    }

    /**
     * フィボナッチ数を計算するメソッド
     * @param aNumber 求めるフィボナッチ数
     * @return 求めたフィボナッチ数
     */
    public BigInteger fibonacci(BigInteger aNumber)
    {
        if(aNumber.compareTo(zero) == 0 || aNumber.compareTo(one) == 0){ return aNumber; }
        return fibonacci(aNumber.subtract(one)).add(fibonacci(aNumber.subtract(two)));
    }

    /**
     * 発展プログラミング演習 練習問題5-4のメインプログラム
     */
    public void run()
    {
        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        this.aList.forEach(index -> {
            aPrint.printAnswer(index, this.fibonacci(BigInteger.valueOf(index)));
        });
    }
}
