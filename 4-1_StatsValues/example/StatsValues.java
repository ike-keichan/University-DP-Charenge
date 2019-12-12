package example;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class StatsValues extends Object
{
    /**
     * 乱数を記憶するフィールド
     */
    final private List<Integer> aList = new ArrayList<Integer>();

    /**
     * 発展プログラミング演習 練習問題4-1の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //乱数を保持するリストの生成
        Random random = new Random();
        for(Integer index = 0; index < 100; index++){
            this.aList.add(random.nextInt(1000));
        }

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //Calculationクラスのインスタンス化
        Calculation aCalculation = new Calculation();

        //出力
        aPrint.printAnswer(this.aList, aCalculation.getSum(this.aList), aCalculation.getMax(this.aList), aCalculation.getMin(this.aList));
    }

    /**
     * 発展プログラミング演習 練習問題4-1のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        StatsValues aStatsValues = new StatsValues();
        aStatsValues.run(arguments);
    }
}
