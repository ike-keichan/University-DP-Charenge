package src;

import java.util.stream.IntStream;

/**
 * FizzBuzzを求めるクラス
 * @author Keisuke Ikeda
 * @version 1.3
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
        if(arguments.length == 0){ System.out.println("入力がなかったため、コマンドライン引数を「15」とします"); }
        this.aNumber = (arguments.length == 0) ? 15 : Integer.valueOf(arguments[0]);
    }

    /**
     * 発展プログラミング演習 練習問題2-4の起動プログラム。
     */
    public void run()
    {
        IntStream.rangeClosed(1, this.aNumber)
        .mapToObj( index -> 
            (index % 15 == 0) ? "FizzBuzz" :
            (index % 3 == 0) ? "Fizz" :
            (index % 5 == 0) ? "Buzz" :
            String.valueOf(index)
        ).forEach(System.out::println);
    }
}
