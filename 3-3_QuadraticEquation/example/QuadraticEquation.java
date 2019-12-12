package example;

import java.util.List;
import java.util.ArrayList;

public class QuadraticEquation extends Object
{
    /**
     * 標準入力の文字列をDouble型で記憶するフィールド
     */
    final private List<Double> aList = new ArrayList<Double>();

    /**
     * 発展プログラミング演習 練習問題3-3の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「1 -4 4」とします");
            this.aList.add(1.0);
            this.aList.add(-4.0);
            this.aList.add(4.0);
        }

        //標準入力の文字列の配列をListに写す。
        for(String argument: arguments){
            this.aList.add(Double.valueOf(argument));
        }

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //判別式の結果を記憶する
        Double aDouble = this.discriminant();

        //判別の式より、出力を判別
        if(aDouble > 0){
            aPrint.RealNumberSolution(this.aList, aDouble);
        }else if(aDouble < 0){
            aPrint.ImaginaryNumberSolution(this.aList, aDouble);
        }else {
            aPrint.MultipleSolution(this.aList, aDouble);
        }

    }

    /**
     * 判別式D=b2−4acの結果を返すプログラム
     * @return 判別式D=b2−4acの結果
     */
    public Double discriminant()
    {
        return aList.get(1) * aList.get(1) - 4 * aList.get(0) * aList.get(2);
    }

    /**
     * 発展プログラミング演習 練習問題3-3のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        QuadraticEquation aQuadraticEquation = new QuadraticEquation();
        aQuadraticEquation.run(arguments);
    }
}
