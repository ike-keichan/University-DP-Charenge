package example;

public class Factorial extends Object
{
    /**
     * 発展プログラミング演習 練習問題2-3のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        //変数の宣言
        Integer aNumber = 10;
        Integer sumNumber = 1;

        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「10」とします");
        } else{
            aNumber = Integer.valueOf(arguments[0]);
        }

        //階乗の計算
        for(Integer index = 1; index <= aNumber; index++)
        {
            sumNumber = sumNumber * index;
        }

        //文字列連結と出力
        StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(aNumber);
        aBuffer.append("! = ");
        aBuffer.append(sumNumber);
        System.out.println(aBuffer.toString());

    }
}
