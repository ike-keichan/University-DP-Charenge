package src;

import java.util.List;
import java.util.ArrayList;

/**
 * 結果を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Print extends Object
{
    /**
     * 出力時の文字連結を行うためのフィールド
     */
    final private StringBuffer aBuffer = new StringBuffer();

    /**
     * 出力回数を記憶するフィールド
     */
    private  Integer count = 1;

    /**
     * 出力回数の上限を記憶するフィールド
     */
    private  Integer max = 1;

    /**
     * 発展プログラミング演習 練習問題4-3の出力プログラム。
     * @param aNumber コマンドライン引数で指定された値
     * @param aList 素因数のリスト
     */
    public void printAnswer(Integer aNumber, List<Integer> aList)
    {
        max = aList.size();
        aBuffer.append(aNumber);
        aBuffer.append(" = ");

        aList.forEach(this::printFormula);

        System.out.println(aBuffer.toString());
    }

    /**
     * 発展プログラミング演習 練習問題4-3の出力プログラム。
     * @param aNumber 素因数
     */
    public void printFormula(Integer aNumber){
        aBuffer.append(aNumber);
        if(!this.count.equals(max)){
            aBuffer.append(" * ");
            this.count++;
        }
    }
}
