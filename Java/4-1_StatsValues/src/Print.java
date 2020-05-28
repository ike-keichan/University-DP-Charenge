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
     * ループ回数を記憶するフィールド
     */
    private Integer count = 1;

    /**
     * 発展プログラミング演習 練習問題4-1の出力プログラム
     * @param aList 乱数リスト
     * @param sum　合計
     * @param max　最大値
     * @param min　最低値
     */
    public void printAnswer(List<Integer> aList, Integer sum, Integer max, Integer min)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("合計: ");
        aBuffer.append(sum);
        aBuffer.append(", 最大値: ");
        aBuffer.append(max);
        aBuffer.append(", 最小値: ");
        aBuffer.append(min);
        aBuffer.append(", 平均値: ");
        aBuffer.append(sum / 100);
        System.out.println(aBuffer.toString());

        aList.forEach(this::printNumber);
    }

    /**
     * 発展プログラミング演習 練習問題4-1の出力プログラム
     * @param number 乱数の値
     */
    public void printNumber(Integer number){
        //行や段を揃えるための判別
        if(count % 10 == 0){
            System.out.printf("%4d %n", number);
        }else {
            System.out.printf("%4d ", number);
        }
        this.count++;
    }
}