package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ファイルの中を閲覧するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Cat2 extends Object
{
    /**
     * 閲覧するファイル名を格納するフィールド
     */
    private List<String> fileNames = new ArrayList<String>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Cat2(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。引数に「閲覧するファイル名」の指定をしてください。");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.fileNames.add(arguments[index]);
            });
        }
    }

    /**
     * ファイルメソッド
     * @param aFile 削除するディレクトリ・ファイル
     */
    public void readFile(File aFile)
    {
        try
        {
            //バイト単位でアクセスできるようにする。
            FileInputStream aFileInputStream = new FileInputStream(aFile);

            //文字単位でアクセスできるようにする。
            InputStreamReader anInputStreamReader = new InputStreamReader(aFileInputStream);

            //バッファを用いたリーダを用意する。高速に読むことが可能。
            BufferedReader aBufferedReader = new BufferedReader(anInputStreamReader);

            String aString = null;
            Integer index = 0;

            while ((aString = aBufferedReader.readLine()) != null) // 一行ずつ読み込みます。
			{
                index++;
                
                //出力
                final StringBuffer aBuffer = new StringBuffer();
                aBuffer.append(String.format("%3d", index));
                aBuffer.append("：");
                aBuffer.append(aString);
                System.out.println(aBuffer.toString());
			}

            //ファイルを閉じる
            aBufferedReader.close(); 
        }
        catch (FileNotFoundException anException) { anException.printStackTrace(); }
		catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
        catch (IOException anException) { anException.printStackTrace(); }
    }

    /**
     * 発展プログラミング演習 練習問題8-1の起動プログラム
     */
    public void run()
    {
        this.fileNames.stream()
            .map(fileName -> new File(fileName))
            .forEach(this::readFile);
    }
}
