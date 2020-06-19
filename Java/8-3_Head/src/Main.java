package src;

/**
 * 問題
 * 指定された行数だけファイルの先頭から出力するコマンドHeadを作成しましょう． 
 * コマンドライン引数では，行数とファイル名を受け取ってください． 
 * ただし，ファイル名は省略可能です．
 * ファイル名が省略された場合，標準入力から読み込むようにしてください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題8-3のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		Head aHead = new Head(arguments);
        aHead.run();
	}
}
