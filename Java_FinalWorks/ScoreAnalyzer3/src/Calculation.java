package src;

import java.util.ArrayList;
import java.util.List;

/**
 * 計算を行うクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Calculation extends Object
{
    /**
     * 全学生のとある問題の点数の最大値を返すメソッド
     * @param aDataList DataTable型のList
     * @param problemNumber 問題番号
     * @return max 全学生のとある問題の点数の最大値
     */
    public Double maxScore(List<DataTable> aDataList, Integer problemNumber)
    {
        //DataTableのリストをDoubleのリストにする際に、空文字「」を0に置き換える。その後、stream処理で最大値を求める。
        Double max = aDataList.stream()
			.filter(aData -> aData.getProblemNumber().equals(problemNumber))
            .map(aData -> aData.getScore())
            .map(score -> { 
                if(score.equals("")){ return "0"; }
                else{ return score; } })
            .mapToDouble(Double::valueOf)
            .max().orElse(0);

        return max;
    }

    /**
     * 全学生のとある問題の点数の最小値を返すメソッド
     * @param aDataList DataTable型のList
     * @param problemNumber 問題番号
     * @return min 全学生のとある問題の点数の最小値
     */
    public Double minScore(List<DataTable> aDataList, Integer problemNumber)
    {       
        //DataTableのリストをDoubleのリストにする際に、空文字「」を0に置き換える。その後、stream処理で最小値を求める。
        Double min = aDataList.stream()
			.filter(aData -> aData.getProblemNumber().equals(problemNumber))
            .map(aData -> aData.getScore())
            .map(score -> { 
                if(score.equals("")){ return "0"; }
                else{ return score; } })
            .mapToDouble(Double::valueOf)
            .min().orElse(0);

        return min;
    }

    /**
     * 全学生のとある問題の点数の合計値を返すメソッド
     * @param aDataList DataTable型のList
     * @param problemNumber 問題番号
     * @return sum 全学生のとある問題の点数の合計値
     */
    public Double sumScore(List<DataTable> aDataList, Integer problemNumber)
    {       
        //DataTableのリストをDoubleのリストにする際に、空文字「」を0に置き換える。その後、stream処理で合計値を求める。
        Double sum = aDataList.stream()
			.filter(aData -> aData.getProblemNumber().equals(problemNumber))
            .map(aData -> aData.getScore())
            .map(score -> { 
                if(score.equals("")){ return "0"; }
                else{ return score; } })
            .mapToDouble(Double::valueOf)
            .sum();
        
        return sum;
    }

    /**
     * 全学生のとある問題の点数の平均値を返すメソッド
     * @param aDataList DataTable型のList
     * @param problemNumber 問題番号
     * @return average 全学生のとある問題の点数の平均値
     */
    public Double averageScore(List<DataTable> aDataList, Integer problemNumber)
    {       
        Long count = aDataList.stream()
            .filter(aData -> aData.getProblemNumber().equals(problemNumber))
            .count();

        return this.sumScore(aDataList, problemNumber) / count;
    }
            
    /**
     * ある学生の点数リストの最大値を返すメソッド
     * @param aList String型のArrayList
     * @return max ある学生の点数リストの最大値
     */
    public Integer maxScore(ArrayList<String> aList)
    {       
        //StringのリストをIntegerのリストにする際に、空文字「」を0に置き換える。その後、stream処理で最大値を求める。
        Integer max = aList.stream()
            .map(score -> { 
                if(score.equals("")){ return "0"; }
                else{ return score; } })
            .mapToInt(Integer::valueOf)
            .max().orElse(0);

        return max;
    }

    /**
     * ある学生の点数のリストの最小値を返すメソッド
     * @param aList String型のArrayList
     * @return min ある学生の点数リストの最小値
     */
    public Integer minScore(ArrayList<String> aList)
    {
        //StringのリストをIntegerのリストにする際に、空文字「」を0に置き換える。その後、stream処理で最小値を求める。
        Integer min = aList.stream()
            .map(score -> { 
                if(score.equals("")){ return "0"; }
                else{ return score; } })
            .mapToInt(Integer::valueOf)
            .min().orElse(0);

        return min;
    }

    /**
     * ある学生の点数のリストの合計値を返すメソッド
     * @param aList String型のArrayList
     * @return sum ある学生の点数リストの合計値
     */
    public Integer sumScore(ArrayList<String> aList)
    {
        //StringのリストをIntegerのリストにする際に、空文字「」を0に置き換える。その後、stream処理で合計値を求める。
        Integer sum = aList.stream()
            .map(score -> { 
                if(score.equals("")){ return "0"; }
                else{ return score; } })
            .mapToInt(Integer::valueOf)
            .sum();

        return sum;
    }

    /**
     * ある学生の点数のリストの平均値を返すメソッド
     * @param aList String型のArrayList
     * @return average ある学生の点数リストの平均値
     */
    public Integer averageScore(ArrayList<String> aList)
    {
        return this.sumScore(aList) / aList.size();
    }
}
