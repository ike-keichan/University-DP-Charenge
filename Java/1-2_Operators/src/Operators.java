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
        //加算
        final StringBuffer firstBuffer = new StringBuffer();
        firstBuffer.append(firstNumber);
        firstBuffer.append("+");
        firstBuffer.append(secondNumber);
        firstBuffer.append("=");
        firstBuffer.append(firstNumber + secondNumber);
        System.out.println(firstBuffer.toString());
        //減算
        final StringBuffer secondBuffer = new StringBuffer();
        secondBuffer.append(firstNumber);
        secondBuffer.append("-");
        secondBuffer.append(secondNumber);
        secondBuffer.append("=");
        secondBuffer.append(firstNumber - secondNumber);
        System.out.println(secondBuffer.toString());
        //減算
        final StringBuffer thirdBuffer = new StringBuffer();
        thirdBuffer.append(firstNumber);
        thirdBuffer.append("*");
        thirdBuffer.append(secondNumber);
        thirdBuffer.append("=");
        thirdBuffer.append(firstNumber * secondNumber);
        System.out.println(thirdBuffer.toString());
        //乗算
        final StringBuffer fourthBuffer = new StringBuffer();
        fourthBuffer.append(firstNumber);
        fourthBuffer.append("/");
        fourthBuffer.append(secondNumber);
        fourthBuffer.append("=");
        fourthBuffer.append(firstNumber / secondNumber);
        System.out.println(fourthBuffer.toString());
        //徐算
        final StringBuffer fifthBuffer = new StringBuffer();
        fourthBuffer.append(firstNumber);
        fourthBuffer.append("%");
        fourthBuffer.append(secondNumber);
        fourthBuffer.append("=");
        fourthBuffer.append(firstNumber % secondNumber);
        System.out.println(fifthBuffer.toString());
        
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
