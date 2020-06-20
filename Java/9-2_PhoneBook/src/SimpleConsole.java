package src;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * コマンドライン入力を行うクラス
 * @author Tamada, Keisuke Ikeda
 * @version 1.0
 */
public class SimpleConsole
{
    /**
     * コマンドライン入力を格納するフィールド
     */
    private BufferedReader in;

    /**
     * コンストラクタ
     */
    public SimpleConsole()
    {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * 入力を待機するメソッド
     * @throws IOException 無視する
     */
    public String readLine() throws IOException
    {
        return in.readLine();
    }

    /**
     * 入力を終了するメソッド
     * @throws IOException 無視する
     */
    public void close() throws IOException
    {
        in.close();
    }
}
