package src;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * 組み合わせを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Combination extends Object
{
    /**
     * 組み合わせで取り出せるものの数を表すフィールド
     */
    private Integer n = 4;

    /**
     * 組み合わせで取り出す回数を表すフィールド
     */
    private Integer k = 2;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Combination(String[] arguments){
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「n=4, k=2」とします");
        } else{
            this.n = Integer.valueOf(arguments[0]);
            this.k = Integer.valueOf(arguments[1]);
        }
    }

    /**
     * 
     * @param n 取り出せるものの数
     * @param k　取り出す回数
     */
    public Integer combination(Integer n, Integer k)
    {
        if(n.equals(k) || k.equals(0) || n < k){ return 1; }
        return this.combination(n - 1, k - 1) + this.combination(n - 1, k);
    }

    /**
     * 発展プログラミング演習 小テスト5のメインプログラム
     */
    public void run()
    {
        Print aPrint = new Print();
        aPrint.printAnswer(this.n, this.k, this.combination(this.n, this.k));
    }
}
