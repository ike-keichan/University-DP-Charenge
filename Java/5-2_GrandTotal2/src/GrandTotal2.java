package src;

import java.util.function.IntUnaryOperator;

/**
 * 総和を求めるクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class GrandTotal2 extends Object
{
    /**
     * コマンドライン引数から与えられた最大値を格納するフィールド
     */
    private Integer aNumber = 10;

    /**
     * 総和を求める関数
     */
    final private IntUnaryOperator grandTotal = (aNumber) -> 
    {
        if(aNumber == 1){ return 1; }
        return aNumber + this.grandTotal.applyAsInt(aNumber -1);
    };

    /**
     * コンストラクタ
     * @param arguments
     */
    public GrandTotal2(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「10」とします");
        }else {
            this.aNumber = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 練習問題5-2の起動プログラム
     */
    public void run()
    {
        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printAnswer(this.aNumber, this.grandTotal.applyAsInt(this.aNumber));
    }

}
