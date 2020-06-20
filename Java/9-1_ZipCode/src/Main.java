package src;

/**
 * 問題
 * ここでは，郵便番号から住所の検索を行うプログラムを作成します．
 * 郵便番号データを用意してください
 * 郵便番号データダウンロードページから自分の出身地の郵便番号データをダウンロードしてください．
 * ダウンロードしたファイルの文字コードは ShiftJIS になっています．utf-8 でなければJavaでは文字化けを起こしますので，変換しておいてください．
 * 郵便番号を読み込み，検索を行うプログラムを作成してください．
 * コマンドライン引数で与えられた郵便番号に対応する住所を出力してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題9-1のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		ZipCode aZipCode = new ZipCode(arguments);
        aZipCode.run();
	}
}
