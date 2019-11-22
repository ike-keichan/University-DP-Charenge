package example;

public class BigAndSmall extends Object
{
	/**
	 * 発展プログラミング演習 練習問題1-1のメインプログラム。
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		//　乱数の宣言
		Double aDouble = Math.random();

		// 文字列の宣言
		String aString = new String();

		//　生成した乱数が0.5と比較しての大小を判定
		if(aDouble < 0.5){
			aString = "Small";
		}else {
			aString = "Big";
		}

		// 判定結果を表示
		System.out.println("value:" + aDouble);
		System.out.println("result:" + aString);
	}
}
