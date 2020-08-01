package src;

import java.util.stream.IntStream;

/**
 * ターミナル上に＼”バックスラッシュ”を描くクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class BackSlashPrinter extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-6の起動プログラム
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        IntStream.range(1, 10).forEach( rowIndex -> {
            IntStream.range(1, 10).forEach( lineIndex -> {
                String aString = rowIndex == lineIndex ? "X" : ".";
                System.out.printf(aString);
            });
            System.out.println();
        });

        return;
    }
}
