package src;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Print extends Object
{
    /**
     * 発展プログラミング演習 練習問題5-6の出力プログラム。
     * @param reversedString 反転した文字列
     * @param flag 回文であるかどうかの真偽値
     */
    public void printAnswer(String reversedString, Boolean flag)
    {
       //出力
       final StringBuffer aBuffer = new StringBuffer();
       aBuffer.append(reversedString);
       aBuffer.append("：");
       aBuffer.append(flag);
       System.out.println(aBuffer.toString());
    }
}
