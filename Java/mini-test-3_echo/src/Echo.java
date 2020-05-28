package src;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * 名前を逆順にするクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Echo extends Object
{     
    /**
     * 出力する文字列リストのフィールド
     */
    private List<String> aList = new ArrayList<String>();

    /**
     * Printクラスをインスタンス化したフィールド
     */
    private Print aPrint = new Print();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Echo(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length != 0){
            IntStream.range(0, arguments.length).forEach(index -> {
                this.aList.add(arguments[index]);
            });
        }
    }

    /**
     * 発展プログラミング演習 小テスト3の起動プログラム
     */
    public void run()
    {
        if(this.aList.isEmpty() || this.aList.get(0).equals("-h")){
            this.aPrint.printHelp();
        }else if(this.aList.get(0).equals("-n")){
            this.aPrint.noLineBreakPrintString(this.aList);
        }else {
            this.aPrint.printString(this.aList);
        }
    }
}
