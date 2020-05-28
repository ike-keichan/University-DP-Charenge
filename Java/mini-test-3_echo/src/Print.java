package src;

import java.util.List;
import java.util.ArrayList;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Print extends Object
{
    /**
     * 改行ありで文字列を出力するメソッド
     * @param aString 出力する文字列
     */
    public void printString(List<String> aList)
    {
        aList.forEach(System.out::println);
    }

    /**
     * 改行なしで文字列を出力するメソッド
     * @param aString 出力する文字列
     */
    public void noLineBreakPrintString(List<String> aList)
    {
        aList.remove(0);
        aList.forEach(aString -> {
            System.out.print(aString + " ");
        });
    }

    /**
     * Helpを出力するメソッド
     */
    public void printHelp()
    {
        System.out.println("java Echo [OPTIONS] <string...>");
        System.out.println("OPTIONS");
        System.out.println("    -h: このメッセージを表示して終了する．");
        System.out.println("    -n: 改行せずに出力する．");
    }
}
