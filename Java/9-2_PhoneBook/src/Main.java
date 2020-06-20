package src;

import java.io.IOException;

/**
 * 問題
 * 以下の仕様に従った名前と電話番号のペアを管理する電話帳を作成しましょう．
 * 
 * add 名前 電話番号
 * 電話帳に名前と対応する電話番号を追加する．
 * 
 * list
 * 登録された名前と電話番号の一覧を表示する．
 * 
 * find 名前
 * 電話帳に名前が存在すれば名前と電話番号を表示する．
 * 電話帳に名前が存在しなければ何も表示しない．
 * 
 * remove 名前
 * 電話帳から名前のデータを削除する．
 * 電話帳に名前のデータが存在しなければ何も行わない
 * 
 * exit
 * 電話帳を終了する．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題9-2のメインプログラム
	 * @param arguments 引数の文字列の配列
	 * @throws IOException 無視する
	 */
	public static void main(String[] arguments) throws IOException
	{
		PhoneBook aPhoneBook = new PhoneBook();
        aPhoneBook.run();
	}
}
