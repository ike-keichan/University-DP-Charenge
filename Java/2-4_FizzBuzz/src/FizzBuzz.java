package src;

import java.util.stream.IntStream;

/**
 * FizzBuzzを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class FizzBuzz extends Object
{
    /**
     * 入力された値を格納するフィールド
     */
    private Integer aNumber = 15;

    /**
     * コンストラクタ
     * @param arguments
     */
    public FizzBuzz(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「15」とします");
        } else{
            this.aNumber = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 練習問題2-4の起動プログラム。
     */
    public void run()
    {
        IntStream.rangeClosed(1, this.aNumber).forEach( index -> {
            if(index % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(index % 3 == 0){
                System.out.println("Fizz");
            }else if(index % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(index);
            }
        });
    }
}
