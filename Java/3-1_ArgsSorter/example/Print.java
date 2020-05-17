package example;

import java.util.List;
import java.util.ArrayList;

public class Print extends Object
{

    /**
     * 発展プログラミング演習 練習問題3-1の出力プログラム。
     * @param status 状態を表す引数（beforeとafterの二つの状態を持つ）
     * @param aList　標準入力で得た文字列を参照するListの引数
     */
    public void printArrays(String status, List<String> aList)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(status);
        aBuffer.append(": ");
        aList.forEach((final String aValue) -> aBuffer.append(aValue + ", "));
        System.out.println(aBuffer.toString());

    }

}
