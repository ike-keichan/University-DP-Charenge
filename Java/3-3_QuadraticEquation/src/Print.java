package src;

import java.util.List;
import java.util.ArrayList;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Print extends Object
{
    /**
     * 実数解を計算・出力するメソッド。
     * @param aList 入力値を記憶するリスト
     * @param aDouble 判別式の解
     */
    public void RealNumberSolution(List<Double> aList, Double aDouble)
    {
        //解を計算
        Double answer1 = -1 * aList.get(1) / (2 * aList.get(0));
        Double answer2 = Math.sqrt(aDouble) / (2 * aList.get(0));

        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("解: ");
        aBuffer.append(answer1 + answer2);
        aBuffer.append(" , ");
        aBuffer.append(answer1 - answer2);
        System.out.println(aBuffer.toString());
    }

    /**
     * 虚数解を計算・出力するメソッド。
     * @param aList 入力値を記憶するリスト
     * @param aDouble 判別式の解
     */
    public void ImaginaryNumberSolution(List<Double> aList, Double aDouble)
    {
        //解を計算
        Double answer1 = -1 * aList.get(1) / (2 * aList.get(0));
        Double answer2 = Math.sqrt(-1 * aDouble) / (2 * aList.get(0));

        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("解: ");
        aBuffer.append(answer1 + answer2);
        aBuffer.append(" , ");
        aBuffer.append(answer1 - answer2);
        System.out.println(aBuffer.toString());
    }

    /**
     * 重解を計算・出力するメソッド。
     * @param aList 入力値を記憶するリスト
     * @param aDouble 判別式の解
     */
    public void MultipleSolution(List<Double> aList, Double aDouble)
    {
        //解を計算
        Double answer1 = -1 * aList.get(1) / (2 * aList.get(0));

        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("解: ");
        aBuffer.append(answer1);
        System.out.println(aBuffer.toString());
    }
}
