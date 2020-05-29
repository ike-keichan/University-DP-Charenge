package src;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Print extends Object
{
    /**
     * 発展プログラミング演習 練習問題5-2の出力プログラム。
     * @param aNumber コマンドライン引数で指定された値
     * @param sum 総和
     */
    public void printAnswer(Integer aNumber, Integer sum)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("1から");
        aBuffer.append(aNumber);
        aBuffer.append("までの総和は");
        aBuffer.append(sum);
        aBuffer.append("です.");
        System.out.println(aBuffer.toString());
    }
}
