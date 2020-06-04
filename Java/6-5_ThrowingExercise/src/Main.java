package src;

/**
 * 問題
 * 例題3と例題4を合わせた動きをするボールを描きましょう． 
 * x軸方向には，例題３を，y軸方向には，例題４の動きを設定すれば良いでしょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題6-5のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments) throws InterruptedException
    {
		ThrowingExercise aThrowingExercise = new ThrowingExercise();
        aThrowingExercise.run();
	}
}
