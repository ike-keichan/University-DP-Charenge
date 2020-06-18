package src;

/**
 * 問題
 * ファイル，ディレクトリを削除するコマンド Remover を作成してください． 
 * コマンドライン引数で受け取った複数のパスのファイルを削除するコマンドです． 
 * ディレクトリ内にファイルがあったとしても，それらも全て削除してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題7-4のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
		Remover aRemover = new Remover(arguments);
        aRemover.run();
	}
}
