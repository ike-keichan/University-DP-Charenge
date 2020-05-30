package src;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 名前を逆順にするクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class NameReverser extends Object
{     
    /**
     * 判定する名前を格納するフィールド
     */
    private String name = "Ikeda Keisuke";

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public NameReverser(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length == 0) {
            System.out.println("入力がなかったため、コマンドライン引数を「Ikeda Keisuke」とします");
        } else {
            this.name = String.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 小テスト１の起動プログラム
     */
    public void run()
    {
        IntStream.range(0, this.name.length())
            .boxed()                            //IntegerのStreamに変形
            .sorted(Comparator.reverseOrder())  //逆順ソート
            .forEach( index -> {
                System.out.print(this.name.charAt(index));
            });
        System.out.println();
    }
}
