package example;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class Calculation extends Object
{
    /**
     * 合計を算出するプログラム。
     * @param aList 乱数リスト
     * @return sum 合計
     */
    public Integer getSum(List<Integer> aList)
    {
        //ラムダ式
        Integer sum = aList.stream()
                .mapToInt(number -> number)
                .sum();

        return sum;
    }

    /**
     * 最大値を算出するプログラム。
     * @param aList 乱数リスト
     * @return max 最大値
     */
    public Integer getMax(List<Integer> aList)
    {
        //ラムダ式
         Integer max = aList.stream()
                 .mapToInt(number -> number)
                 .max().orElse(0);

        return max;
    }

    /**
     * 最低値を算出するプログラム。
     * @param aList 乱数リスト
     * @return min 最低値
     */
    public Integer getMin(List<Integer> aList)
    {
        //ラムダ式
        Integer min = aList.stream()
                .mapToInt(number -> number)
                .min().orElse(0);

        return min;
    }


}
