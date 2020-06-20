package src;

import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

/**
 * 台形公式による積分計算を利用したπの計算を行うクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class TrapezoidalRulePi extends Object
{
    /**
     * 台形の横幅を記憶するフィールド
     */
    private Double width = 0.001;

    /**
     * 台形の面積の総和を記憶するフィールド
     */
    private Double sum = 0.0;

    /**
	 * 台数の面積を算出する関数
	 */
    private DoubleUnaryOperator trapezoidArea = (aDouble) -> 
    {
        Double upperBottom = Math.sqrt(1 - (aDouble - this.width) * (aDouble - this.width));
        Double lowerBottom = Math.sqrt(1 - aDouble * aDouble);
        //面積の算出。
        return (upperBottom + lowerBottom) * this.width / 2;
    };

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public TrapezoidalRulePi(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「0.001」とします");
        }else {
            this.width = Double.valueOf(arguments[0]);
        }
    }

    /**
     * 台形の面積を算出し、足し合わせてπの近似値を算出するプログラム。
     * @return πの近似値
     */
    public Double getApproximation()
    {
        this.sum = DoubleStream.iterate(this.width, index -> index < 1.0, index -> index + this.width)
            .map(this.trapezoidArea::applyAsDouble)
            .sum();
        
        return this.sum * 4;
    }

    /**
     * 発展プログラミング演習 練習問題3-5の起動プログラム。
     */
    public void run()
    {
        //Printクラスのインスタンス化
        Print aPrint = new Print();
        //出力
        aPrint.printAnswer(this.getApproximation());
    }
}

