package example;

import java.util.List;
import java.util.ArrayList;

public class Primes extends Object
{
    /**
     * 指定された値までの数字を記憶するフィールド
     */
    final private List<Integer> aList = new ArrayList<Integer>();

    /**
     * 指定された値までの数字が素数かどうかを記憶するフィールド
     */
    final private List<Boolean> primeList = new ArrayList<Boolean>();

    /**
     * コマンドライン引数を記憶するフィールド
     */
    private Integer aNumber = 200;

    /**
     * 発展プログラミング演習 練習問題4-2の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「200」とします");
        }else {
            this.aNumber = Integer.valueOf(arguments[0]);
        }

        //与えられた値までの数字を保持するリストの生成
        for(Integer anIndex = 0; anIndex < this.aNumber + 1; anIndex++)
        {
            this.aList.add(anIndex);
        }

        //Calculationクラスのインスタンス化
        Calculation aCalculation = new Calculation();

        //素数かどうかを判別するリストを生成
        for(Integer anotherIndex = 0; anotherIndex < this.aNumber + 1; anotherIndex++)
        {
            this.primeList.add(aCalculation.getPrimes(anotherIndex));
        }

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printAnswer(this.aList, this.primeList ,this.aNumber);

    }

    /**
     * 発展プログラミング演習 練習問題4-2のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        Primes aPrimes = new Primes();
        aPrimes.run(arguments);
    }
}
