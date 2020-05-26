package src;

/**
 * 入力が合った場合、その入力に対して挨拶を行うクラス
 * @author Keisuke Ikeda
 * @version 1.2
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
        if(arguments.length == 0){
            this.aString = "Hello, World";
        } else{
            if(arguments[0].equals("World")){
                this.aString = "Hi, World";
            }
            else{
                this.aString = "Hello, " + arguments[0];
            }
        }
    }

    /**
     * 発展プログラミング演習 練習問題2-2の起動プログラム
     */
    public void run()
    {
        System.out.println(this.aString);
    }
}
