package src;

/**
 * 結果を標準出力に表示するクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Printer extends Object
{
    /**
     * 結果を標準出力に表示するメソッド
     * @param aString 文字列の引数
     */
    public void perform(String aString)
    {
        System.out.printf("%s%n", aString);
    }
}
