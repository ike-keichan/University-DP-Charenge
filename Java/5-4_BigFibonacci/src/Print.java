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
     * 発展プログラミング演習 練習問題5-4の出力プログラム。
     * @param aNumber コマンドライン引数で指定された値
     * @param fibonacciNumber　算出したフィボナッチ数
     */
    public void printAnswer(Integer aNumber, BigInteger fibonacciNumber)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("F(");
        aBuffer.append(aNumber);
        aBuffer.append(") = ");
        aBuffer.append(fibonacciNumber);
        System.out.println(aBuffer.toString());
    }
}
