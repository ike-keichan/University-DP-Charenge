package src;

/**
 * 入力が合った場合、その入力に対して挨拶を行うクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class HelloWorld3 extends Object
{
    /**
     * 入力を格納するフィールド
     */
    private String aString;

    /**
     * コンストラクタ
     * @param arguments
     */
    public HelloWorld3(String[] arguments)
    {
        //　コマンドライン引数の有無の判別
        if (arguments.length == 0) { System.out.println("入力がなかったため、引数なしで実行します。"); }
        this.aString = (arguments.length == 0) ? "Hello, World" :
                        (arguments[0].equals("World")) ? "Hi, World" :
                        "Hello, " + arguments[0];
    }

    /**
     * 発展プログラミング演習 練習問題2-2の起動プログラム
     */
    public void run()
    {
        System.out.println(this.aString);
    }
}
