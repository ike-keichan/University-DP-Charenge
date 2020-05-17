package src;

import java.util.stream.IntStream;

public class Multiplication extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-5の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {

        //　一列目の出力
        System.out.println(" ＼ 1  2  3  4  5  6  7  8  9");

        // 二列目以降の出力
        IntStream.range(1, 10).forEach( rowIndex -> {
            System.out.print(" " + rowIndex + " ");
            IntStream.range(1, 10).forEach( lineIndex -> {
                System.out.printf("%2d ", rowIndex * lineIndex);
            });
            System.out.println();
        });

    }
}
