package src;

import java.lang.Runnable;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * 西暦を和暦にするクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class SeirekiToWarekiConverter extends Object
{     
    /**
     * 判定する年を格納するフィールド
     */
    private Integer year = 2020;

	/**
	 * 西暦を出力する関数
	 */
	private Runnable ADPrint = () -> { System.out.print("西暦:" + this.year + "年  "); };

	/**
	 * 和暦を出力する関数
	 */
	private Consumer<String> JCPrint = (aString) -> { System.out.println("和暦:" + aString); };

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public SeirekiToWarekiConverter(String[] arguments)
    {
        // コマンドライン引数の有無の判別
        if (arguments.length == 0) {
            System.out.println("入力がなかったため、コマンドライン引数を「2020」とします");
        } else {
            this.year = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 発展プログラミング演習 小テスト2の起動プログラム
     */
    public void run()
    {
        this.ADPrint.run();

        if(this.year < 1868) {
            System.out.println("明治より前であるため判定できません．");
        } else if(this.year == 1868){
            this.JCPrint.accept("明治元年");
        } else if(this.year < 1912){
            JCPrint.accept("明治" + String.valueOf(this.year - 1868 + 1));
        } else if(this.year == 1912){
            JCPrint.accept("明治" + String.valueOf(this.year - 1868 + 1) + "大正元年");
        } else if(this.year < 1926){
            JCPrint.accept("大正" + String.valueOf(this.year - 1912 + 1));
        } else if(this.year == 1926){
            JCPrint.accept("大正" + String.valueOf(this.year - 1912 + 1) + "昭和元年");
        } else if(this.year < 1989){
            JCPrint.accept("昭和" + String.valueOf(this.year - 1926 + 1));
        } else if(this.year == 1989){
            JCPrint.accept("昭和" + String.valueOf(this.year - 1926 + 1) + "平成元年");
        } else if(this.year < 2019){
            JCPrint.accept("平成" + String.valueOf(this.year - 1989 + 1));
        } else if(this.year == 2019){
            JCPrint.accept("平成" + String.valueOf(this.year - 1989 + 1) + "令和元年");
        } else{
            JCPrint.accept("令和" + String.valueOf(this.year - 2019 + 1));
        }
    }
}
