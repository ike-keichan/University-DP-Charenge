package src;

import java.util.function.IntBinaryOperator;
import java.util.function.ObjIntConsumer;

public class Operators extends Object
{     
    /**
	 * 結果を出力する関数。
	 */
	final ObjIntConsumer<Integer> resultPrint = (firstNumber, secondNumber) -> { 
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
        System.out.println(firstNumber + "%" + secondNumber + "=" + (firstNumber % secondNumber));
    };

    /**
     * 発展プログラミング演習 練習問題1-2の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(final String[] arguments) {

        // 四則演算を行う２数の宣言
        Integer firstNumber = 2;
        Integer secondNumber = 4;

        // コマンドライン引数の有無の判別
        if (arguments.length == 0) {
            System.out.println("入力がなかったため、コマンドライン引数を「2」と「4」とします");
        } else {
            firstNumber = Integer.valueOf(arguments[0]);
            secondNumber = Integer.valueOf(arguments[1]);
        }

        this.resultPrint.accept(firstNumber, secondNumber);
        
    }

}
