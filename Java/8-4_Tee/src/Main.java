package src;

/**
 * 問題
 * ここでは，teeコマンドを作成しましょう．
 * teeコマンドは 標準入力で受け取った文字列を標準出力と，指定されたファイルに出力するコマンドです． 
 * 以下の図のように T の形に入力を分配するところから名付けられています．
 * クラス名をTeeとしてください
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題8-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		Tee aTee = new Tee(arguments);
        aTee.run();
	}
}
