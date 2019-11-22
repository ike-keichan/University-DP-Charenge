package example;

public class Multiplication extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-5のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {

        //　一列目の出力
        System.out.println(" ＼ 1  2  3  4  5  6  7  8  9");

        // 二列目以降の出力
        for(Integer anIndex = 1; anIndex <= 9; anIndex++)
        {
            System.out.print(" " + anIndex + " ");
            for(Integer anotherIndex = 1; anotherIndex <= 9; anotherIndex++)
            {
                System.out.printf("%2d ", anIndex * anotherIndex);
            }
            System.out.println();
        }

    }
}
