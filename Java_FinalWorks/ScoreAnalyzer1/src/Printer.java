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
     * @param score 点数
     * @param examineeCountOfScore 各点数を取った人数
     * @param examineeCount 受験者の人数
     */
    public void perform(String score, Integer examineeCountOfScore, Integer examineeCount)
    {
        System.out.printf("%2s： %5.2f（%2d/%d）%n", score, (double)examineeCountOfScore/examineeCount*100, examineeCountOfScore, examineeCount);
    }
}
