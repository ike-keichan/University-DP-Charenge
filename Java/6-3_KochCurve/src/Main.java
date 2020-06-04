package src;

/**
 * 問題
 * コッホ曲線は，線分を三等分し，分割点を頂点とした正三角形を描く線です． 
 * この作図を無限に繰り返すことで，線分の長さが∞になります． 
 * コマンドライン引数でコッホ曲線の n を指定できるようにしましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題6-3のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		KochCurve aKochCurve = new KochCurve(arguments);
        aKochCurve.run();
	}
}
