package src;

import java.util.function.IntBinaryOperator;
import java.util.function.ObjIntConsumer;

/**
 * 四則演算を行うクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class Operators extends Object
{     
    /**
     * 四則演算に用いるフィールド
     */
    private Integer firstNumber = 2;

    /**
     * 四則演算に用いるフィールド
     */
    private Integer secondNumber = 4;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Operators(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length == 0) { System.out.println("入力がなかったため、コマンドライン引数を「2」と「4」とします"); }
        this.firstNumber = (arguments.length == 0) ? 2 : Integer.valueOf(arguments[0]);
        this.secondNumber = (arguments.length == 0) ? 4 : Integer.valueOf(arguments[1]);
    }

    /**
     * 発展プログラミング演習 練習問題1-2の出力プログラム。
     * @param aNumber 最後に加算した値
     */
    private void print(String operator, Integer result)
    {
        //出力
        final StringBuffer firstBuffer = new StringBuffer();
        firstBuffer.append(this.firstNumber);
        firstBuffer.append(operator);
        firstBuffer.append(this.secondNumber);
        firstBuffer.append("=");
        firstBuffer.append(result);
        System.out.println(firstBuffer.toString());

        return;
    }

    /**
     * 発展プログラミング演習 練習問題1-2の起動プログラム
     */
    public void run()
    {
        this.print("+", this.firstNumber + this.secondNumber);
        this.print("-", this.firstNumber - this.secondNumber);
        this.print("*", this.firstNumber * this.secondNumber);
        this.print("/", this.firstNumber / this.secondNumber);
        this.print("%", this.firstNumber % this.secondNumber);

        return;
    }
}
