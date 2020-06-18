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
     * 発展プログラミング演習 小テスト6の出力プログラム。
     * @param n 取り出せるものの数
     * @param k　取り出す回数
     * @param result 算出結果
     */
    public void printAnswer(Integer n, Integer k, Integer result)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(n);
        aBuffer.append("C");
        aBuffer.append(k);
        aBuffer.append(" = ");
        aBuffer.append(result);
        System.out.println(aBuffer.toString());
    }
}
