package src;

import java.util.function.BiPredicate;
import java.util.stream.IntStream;

/**
 * ターミナル上にX”エックス”を描くクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class XPrinter extends Object
{
    /**
	 * 条件式の関数 argumentが0.5未満だとtrue
	 */
    private BiPredicate<Integer, Integer> checker = (rowIndex, lineIndex) -> rowIndex == lineIndex || rowIndex + lineIndex == 10;

    /**
     * 発展プログラミング演習 練習問題1-7の起動プログラム
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        IntStream.range(1, 10).forEach( rowIndex -> {
            IntStream.range(1, 10).forEach( lineIndex -> {
                String aString = (checker.test(rowIndex, lineIndex)) ? "X" : ".";
                System.out.printf(aString);
            });
            System.out.println();
        });
        
        return;
    }
}
