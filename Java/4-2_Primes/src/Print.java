package src;

import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Print extends Object
{
    /**
     * 出力回数を記憶するフィールド
     */
    private  Integer count = 0;

    /**
     * 発展プログラミング演習 練習問題4-2の出力プログラム。
     * @param aList 指定された値までの数字を記憶するリスト
     * @param primeList 指定された値までの数字が素数かどうかを記憶するリスト
     * @param aNumber コマンドライン引数で指定された値
     */
    public void printAnswer(List<Integer> aList, List<Boolean> primeList, Integer aNumber) {

        //素数を判別して出力
        IntStream.rangeClosed(0, aNumber).forEach(index -> {
            if(primeList.get(index)){
                if (this.count % 10 == 9) {
                    System.out.printf("%4d %n", aList.get(index));
                }else {
                    System.out.printf("%4d", aList.get(index));
                }
                this.count++;
            }
        });
    }
}