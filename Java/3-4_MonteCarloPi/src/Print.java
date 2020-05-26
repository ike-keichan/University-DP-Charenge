package src;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Print extends Object
{
    /**
     * 発展プログラミング演習 練習問題3-4の出力プログラム。
     * @param aDouble 計算結果を表す引数
     */
    public void printAnswer(Double aDouble)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("pi = ");
        aBuffer.append(aDouble);
        System.out.println(aBuffer.toString());
    }
}