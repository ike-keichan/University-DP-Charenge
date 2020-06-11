package src;

import java.math.BigInteger;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Print extends Object
{
    /**
     * 発展プログラミング演習 小テスト5の出力プログラム。
     * @param index 何番目の数かを指定する値
     * @param fibonacciNumber　算出したフィボナッチ数
     */
    public void printAnswer(Integer index, BigInteger mersenneNumber)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("2^");
        aBuffer.append(index);
        aBuffer.append(" - 1 = ");
        aBuffer.append(mersenneNumber);
        aBuffer.append("（");
        aBuffer.append(mersenneNumber.intValue());
        aBuffer.append("）");
        aBuffer.append(mersenneNumber.isProbablePrime(0) ? "probable prime" : "");
        System.out.println(aBuffer.toString());
    }
}
