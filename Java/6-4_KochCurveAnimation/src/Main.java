package src;

/**
 * 問題
 * コッホ曲線をn=0からn=5までを1秒程度で更新して描いてみましょう．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題6-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments) throws InterruptedException
    {
		KochCurveAnimation aKochCurveAnimation = new KochCurveAnimation();
        aKochCurveAnimation.run();
	}
}
