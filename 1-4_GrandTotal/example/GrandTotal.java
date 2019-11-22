package example;

public class GrandTotal extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-4のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        //　総和を出すための変数の宣言
        Integer sum = 0;

        //　それぞれの総和を表示
        for(Integer index = 1; index <= 10 ; index++)
        {
            sum += index;
            System.out.printf("%dから%dまでの総和は%dです．%n", 1, index, sum);
        }

    }
}
