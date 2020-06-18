package src;

/**
 * 問題
 * 与えられた年がうるう年であるか否かを判定しましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題1-3のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		LeapYear aLeapYear = new LeapYear(arguments);
		aLeapYear.run();
	}

}
