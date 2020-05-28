package src;

import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

/**
 * リストを生成するするクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Primes extends Object
{
    /**
     * 指定された値までの数字を記憶するフィールド
     */
    private List<Integer> aList = new ArrayList<Integer>();

    /**
     * 指定された値までの数字が素数かどうかを記憶するフィールド
     */
    private List<Boolean> primeList = new ArrayList<Boolean>();

    /**
     * コマンドライン引数を記憶するフィールド
     */
    private Integer aNumber = 200;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Primes(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「200」とします");
        }else {
            this.aNumber = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 練習問題4-2の起動プログラム。
     */
    public void run()
    {
        //与えられた値までの数字を保持するリストの生成
        IntStream.range(0, this.aNumber + 1)
            .forEach(index -> {
                this.aList.add(index);
            });

        //Calculationクラスのインスタンス化
        Calculation aCalculation = new Calculation();

        //素数かどうかを判別するリストを生成
        IntStream.range(0, this.aNumber + 1)
            .forEach(index -> {
                this.primeList.add(aCalculation.getPrimes(index));
            });

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printAnswer(this.aList, this.primeList ,this.aNumber);
    }
}
