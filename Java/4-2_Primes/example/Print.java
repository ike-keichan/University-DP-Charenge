package example;

import java.util.List;
import java.util.ArrayList;

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
        for(Integer index = 0; index <= aNumber; index++){
            if(primeList.get(index)){
                if (count % 10 == 9) {
                    System.out.printf("%4d %n", aList.get(index));
                }else {
                    System.out.printf("%4d", aList.get(index));
                }
                count++;
            }
        }
    }
}