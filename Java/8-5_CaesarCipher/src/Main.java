package src;

/**
 * 問題
 * カエサル暗号（Caesar暗号; シーザー暗号）はアルファベットをn文字ずらす暗号化方式です． 
 * このn(0≤n≤256)が鍵となります．
 * 例えば，n=1の時，"abracadabra" という文字列はそれぞれ１文字ずれて 'bcsbdbebcsb' になります （'a' → 'b'，'b' → 'c'，'r' → 's'，．．．のようにずらしていきます）．
 * クラス名は CaesarCipherとし，コマンドラインで３つの引数を受け取ってください． 引数は最初から鍵，入力ファイル，出力ファイルとしてください
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題8-5のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		CaesarCipher aCaesarCipher = new CaesarCipher(arguments);
        aCaesarCipher.run();
	}
}
