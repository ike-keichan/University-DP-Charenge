package src;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * ランダムな数字を0.5と比較した大小を出力するクラス
 * @author Keisuke Ikeda
 * @version 1.3
 */
public class BigAndSmall extends Object
{
	/**
	 * 条件式の関数 argumentが0.5未満だとtrue
	 */
	private Predicate<Double> checker = (argument) -> argument < 0.5;

	/**
	 * valueを出力する関数
	 */
	private Consumer<Double> valuePrint = (aDouble) -> { System.out.println("value:" + aDouble); };

	/**
	 * resultを出力する関数
	 */
	private Consumer<String> resultPrint = (aString) -> { System.out.println("result:" + aString); };

	/**
	 * 発展プログラミング演習 練習問題1-1の起動プログラム
	 */
	public void run()
	{
		//　乱数の宣言
		Double aDouble = Math.random();

		//　生成した乱数が0.5と比較しての大小を判定
		String aString = (checker.test(aDouble)) ?  "Small" : "Big" ;

		// 判定結果を表示
		valuePrint.accept(aDouble);
		resultPrint.accept(aString);

		return;
	}
}
