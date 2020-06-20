package src;

import java.util.List;
import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.IntStream;

/**
 * 回文を判定するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class CubicRoot extends Object
{     
    /**
     * 求める立方根の√の中の値を格納するフィールド
     */
    private List<Integer> aList = new ArrayList<Integer>();

    /** 
     * 閾値 
     */
    final private Double threshold = 0.00001;

    /**
     * x^3 - n を計算する関数
     */
    final private DoubleBinaryOperator function = (aNumber, xValue) -> xValue * xValue * xValue - aNumber;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public CubicRoot(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「2」とします");
            this.aList.add(2);
        } else{
            IntStream.range(0, arguments.length).forEach(index -> {
                this.aList.add(Integer.valueOf(arguments[index]));
            });
        }
    }

    /**
     * 立方根を求めるメソッド
     * @param aNumber 求める立方根の√の中の値
     * @return 算出した立方根
     */
    public Double calculate(Integer aNumber)
    {
        Double xValue = 10.0;
        Double yValue = this.function.applyAsDouble(Double.valueOf(aNumber), xValue);

        while(yValue > this.threshold){
            Double aValue = 3 * xValue * xValue;
            Double bValue = yValue - aValue * xValue;
            xValue = -1 * bValue / aValue;
            yValue = this.function.applyAsDouble(Double.valueOf(aNumber), xValue);
        }
        return xValue;
    }

    /**
     * 発展プログラミング演習 練習問題5-7の起動プログラム
     */
    public void run()
    {
        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        this.aList.forEach(index -> {
            aPrint.printAnswer(index, this.calculate(index));
        });
    }
}
