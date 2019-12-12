package example;

public class FizzBuzz extends Object
{
    /**
     * 発展プログラミング演習 練習問題2-4のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        //変数の宣言
        Integer aNumber = 15;

        //　コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「15」とします");
        } else{
            aNumber = Integer.valueOf(arguments[0]);
        }

        //FizzBuzzの計算
        for(Integer index = 1; index <= aNumber; index++)
        {
            if(index % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(index % 3 == 0){
                System.out.println("Fizz");
            }else if(index % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(index);
            }
        }
    }
}
