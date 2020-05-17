package example;

public class BackSlashPrinter extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-6のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {

        // 二列目以降の出力
        for(Integer anIndex = 0; anIndex < 10; anIndex++)
        {
            for(Integer anotherIndex = 0; anotherIndex < 10; anotherIndex++)
            {
                if(anIndex == anotherIndex){
                    System.out.printf("X");
                }else {
                    System.out.printf(".");
                }
            }
            System.out.println();
        }

    }
}
