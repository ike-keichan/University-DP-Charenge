package src;

import java.math.BigInteger;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Print extends Object
{
    /**
     * 発展プログラミング演習 練習問題5-7の出力プログラム。
     * @param aNumber 求める立方根の√の中の値
     * @param fibonacciNumber 算出した立方根
     */
    public void printAnswer(Integer aNumber, Double squareRoot)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("cubic_root(");
        aBuffer.append(Double.valueOf(aNumber));
        aBuffer.append(") = ");
        aBuffer.append(squareRoot);
        System.out.println(aBuffer.toString());
    }
}
