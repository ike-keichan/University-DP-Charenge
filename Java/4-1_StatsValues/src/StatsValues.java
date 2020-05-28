package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 乱数表を生成するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class StatsValues extends Object
{
    /**
     * 乱数を記憶するフィールド
     */
    private List<Integer> aList = new ArrayList<Integer>();

    /**
     * 発展プログラミング演習 練習問題4-1の起動プログラム
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //乱数を保持するリストの生成
        Random random = new Random();
        IntStream.range(0, 100).forEach(index -> {
            this.aList.add(random.nextInt(1000));
        });
        
        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //Calculationクラスのインスタンス化
        Calculation aCalculation = new Calculation();

        //出力
        aPrint.printAnswer(this.aList, aCalculation.getSum(this.aList), aCalculation.getMax(this.aList), aCalculation.getMin(this.aList));
    }
}
