package src;

import java.util.function.IntBinaryOperator;
import java.util.function.ObjIntConsumer;

/**
 * 四則演算を行うクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Operators extends Object
{     
    /**
     * 四則演算に用いるフィールド
     */
    Integer firstNumber = 2;

    /**
     * 四則演算に用いるフィールド
     */
    Integer secondNumber = 4;

    /**
	 * 結果を出力する関数
	 */
    final ObjIntConsumer<Integer> resultPrint = (firstNumber, secondNumber) -> 
    { 
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
        System.out.println(firstNumber + "%" + secondNumber + "=" + (firstNumber % secondNumber));
    };

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Operators(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length == 0) {
            System.out.println("入力がなかったため、コマンドライン引数を「2」と「4」とします");
        } else {
            this.firstNumber = Integer.valueOf(arguments[0]);
            this.secondNumber = Integer.valueOf(arguments[1]);
        }
    }

    /**
     * 発展プログラミング演習 練習問題1-2の起動プログラム
     */
    public void run()
    {
        this.resultPrint.accept(this.firstNumber, this.secondNumber);
    }

}
