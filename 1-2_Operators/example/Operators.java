package example;

public class Operators extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-2のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        //　四則演算を行う２数の宣言
        Integer aNumber = 2;
        Integer anotherNumber = 4;

        // ラムダ式の宣言
        Runnable adder = () -> System.out.println(aNumber + "+" + anotherNumber + "=" + (aNumber + anotherNumber));
        Runnable subtracter = () -> System.out.println(aNumber + "-" + anotherNumber + "=" + (aNumber - anotherNumber));
        Runnable multiplicater = () -> System.out.println(aNumber + "*" + anotherNumber + "=" + (aNumber * anotherNumber));
        Runnable diviser = () -> System.out.println(aNumber + "/" + anotherNumber + "=" + (aNumber / anotherNumber));
        Runnable modulo = () -> System.out.println(aNumber + "%" + anotherNumber + "=" + (aNumber % anotherNumber));

        // ラムダ式の実行（呼び出し）
        adder.run();
        subtracter.run();
        multiplicater.run();
        diviser.run();
        modulo.run();

    }
}
