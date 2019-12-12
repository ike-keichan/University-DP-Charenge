package example;

public class HelloWorld3 extends Object
{
    /**
     * 発展プログラミング演習 練習問題2-2のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        //　コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("Hello, World");
        } else{
            if(arguments[0].equals("World")){
                System.out.println("Hi, World");
            }
            else{
                System.out.println("Hello, " + arguments[0]);
            }
        }
    }
}
