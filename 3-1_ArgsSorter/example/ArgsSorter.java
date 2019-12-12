package example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArgsSorter extends Object
{
    /**
     * 標準入力の文字列を記憶するフィールド
     */
    final private List<String> aList = new ArrayList<String>();

    /**
     * ラムダ式。コレクションが昇順になるような値を記憶するフィールド
     */
    final private Comparator<String> aComparator = (s1, s2) -> s1.compareTo(s2);

    /**
     * 発展プログラミング演習 練習問題3-1の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「d b e a c」とします");
            this.aList.add("d b e a c");
        }

        //標準入力の文字列の配列をListに写す。
        for(String argument: arguments){
            this.aList.add(argument);
        }

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printArrays("before", this.aList);
        Collections.sort(this.aList, this.aComparator);
        aPrint.printArrays("after", this.aList);
    }


    /**
     * 発展プログラミング演習 練習問題3-1のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        ArgsSorter anArgsSorter = new ArgsSorter();
        anArgsSorter.run(arguments);
    }
}
