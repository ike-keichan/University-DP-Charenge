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
     * @param problemNumber 問題番号
     * @param aString 文字列の引数
     */
    public void perform(String problemNumber, String aString)
    {
        System.out.printf("%2s：%s%n", problemNumber, aString);
    }
}
