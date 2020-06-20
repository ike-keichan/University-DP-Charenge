package src;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

/**
 * 二次方程式の解を求めるクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class QuadraticEquation extends Object
{
    /**
     * 標準入力の文字列をDouble型で記憶するフィールド
     */
    final private List<Double> aList = new ArrayList<Double>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public QuadraticEquation(String[] arguments){
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「1 -4 4」とします");
            this.aList.add(1.0);
            this.aList.add(-4.0);
            this.aList.add(4.0);
        }

        //標準入力の文字列の配列をListに写す。
        Stream.of(arguments).forEach(argument -> {
            this.aList.add(Double.valueOf(argument));
        });
    }

    /**
     * 発展プログラミング演習 練習問題3-3の起動プログラム。
     */
    public void run()
    {
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
}
