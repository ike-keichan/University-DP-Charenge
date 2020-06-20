package src;

/**
 * 問題
 * リバーシ（オセロ）の初期配置を描画するプログラム，Reversi を作成してください．
 * 実行例のように，端に 10 の幅を設け，各セルの大きさは50ピクセルの正方形としてください．
 * そのため，描画面の大きさは 420×420 としてください．
 * 色は必ずしも実行例の通りでなくても構いません．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 小テスト7のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		Reversi aReversi = new Reversi();
        aReversi.run();
	}
}
