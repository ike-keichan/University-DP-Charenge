package src;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * 再帰を用いて、複数のコマンドライン引数に対応させたプログラムである。
 * しかし、計算速度や負荷を考えた場合、「2-5_Fibonacci」の方が最適なプログラムであると言える。
 * こちらは再帰こそしていないものの、連想表を構築しており、much better!
 */

/**
 * Fibonacciを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Fibonacci2 extends Object
{
    /**
     * フィボナッチ数列で計算するフィールド
     */
    private List<Integer> aList = new ArrayList<Integer>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Fibonacci2(String[] arguments){
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
    public Integer fibonacci(Integer aNumber)
    {
        if(aNumber == 0 || aNumber == 1){ return aNumber; }
        return this.fibonacci(aNumber - 1) + this.fibonacci(aNumber - 2);
    }

    /**
     * 発展プログラミング演習 練習問題5-3のメインプログラム
     */
    public void run()
    {
        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aList.forEach(index -> {
            aPrint.printAnswer(index, this.fibonacci(index));
        });
    }
}
