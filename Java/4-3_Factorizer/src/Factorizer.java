package src;

import java.util.List;
import java.util.ArrayList;

/**
 * 素因数分解を行うクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Factorizer extends Object
{
    /**
     * 指定された値までの数字が素数かどうかを記憶するフィールド
     */
    private List<Integer> aList = new ArrayList<Integer>();

    /**
     * コマンドライン引数を記憶するフィールド
     */
    private Integer aNumber = 12;

    /**
     * コマンドライン引数を記憶するフィールド
     */
    private Integer anotherNumber = 12;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Factorizer(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「12」とします");
        }else {
            this.aNumber = Integer.valueOf(arguments[0]);
            this.anotherNumber = this.aNumber;
        }
    }

    /**
     * 発展プログラミング演習 練習問題4-3の起動プログラム。
     */
    public void run()
    {
        //Calculationクラスのインスタンス化
        Calculation aCalculation = new Calculation();

        while(!anotherNumber.equals(1))
        {
            this.aList.add(aCalculation.getPrimes(this.anotherNumber));
            this.anotherNumber = this.anotherNumber / aCalculation.getPrimes(this.anotherNumber);
        }

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printAnswer(this.aNumber, this.aList);

    }
}
