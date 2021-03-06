package src;

/**
 * 入力が合った場合、その入力に対して挨拶を行うクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class HelloWorld2 extends Object
{
    /**
     * 入力を格納するフィールド
     */
    private String aString = "World";

    /**
     * コンストラクタ
     * @param arguments
     */
    public HelloWorld2(String[] arguments)
    {
        //　コマンドライン引数の有無の判別
        if (arguments.length == 0) { System.out.println("入力がなかったため、コマンドライン引数を「World」とします"); }
        this.aString = (arguments.length == 0) ? "World" : arguments[0] ;
    }

    /**
     * 発展プログラミング演習 練習問題2-1の起動プログラム。
     */
    public void run()
    {
        System.out.println("Hello, " + this.aString);
    }
}
