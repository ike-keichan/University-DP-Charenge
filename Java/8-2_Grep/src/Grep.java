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
 * ファイルの中に文字列が含まれているか探索するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Grep extends Object
{
    /**
     * 探索する文字列を格納するフィールド
     */
    private String keyword = "new";

    /**
     * 閲覧するファイル名を格納するフィールド
     */
    private List<String> fileNames = new ArrayList<String>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Grep(String[] arguments)
    {
        if(arguments.length == 0 || arguments.length == 1){
            System.out.println("入力がありません。第一引数に「探索する文字列」、第二引数以降に「閲覧するファイル名」の指定をしてください。");
            System.out.println("引数第一引数を「new」、第二引数以降を「./src/Main.java」「./src/Grep.java」として実行します。");
            System.out.println("------------------------------------------------------------");
            this.fileNames.add("./src/Main.java");
            this.fileNames.add("./src/Grep.java");
        } else {
            this.keyword = arguments[0];
            IntStream.range(1, arguments.length).forEach( index -> {
                this.fileNames.add(arguments[index]);
            });
        }
    }

    /**
     * ファイルを読み込むメソッド
     * @param aFile 読み込みをするファイル
     */
    public void readFile(File aFile)
    {
        try
        {
            //バイト単位でアクセスできるようにする。
            FileInputStream aFileInputStream = new FileInputStream(aFile);
            //文字単位でアクセスできるようにする。
            InputStreamReader anInputStreamReader = new InputStreamReader(aFileInputStream, "UTF-8");
            //バッファを用いたリーダを用意する。高速に読むことが可能。
            BufferedReader aBufferedReader = new BufferedReader(anInputStreamReader);

            String aString = null;

            // 一行ずつ読み込みます。
            while ((aString = aBufferedReader.readLine()) != null)
			{
                if(aString.contains(this.keyword)) {
                    this.printFile(aFile.getName(), aString);
                }
            }
            
            System.out.println("------------------------------------------------------------");

            //ファイルを閉じる
            aBufferedReader.close(); 
        }
        catch (FileNotFoundException anException) { anException.printStackTrace(); }
		catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
        catch (IOException anException) { anException.printStackTrace(); }
    }

    /**
     * ファイルの中を標準出力するメソッド
     * @param lineNumber キーワードが見つかったファイル名
     * @param aString ファイルの各行の文字列
     */
    public void printFile(String fileName, String aString)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(fileName);
        aBuffer.append("：");
        aBuffer.append(aString);
        System.out.println(aBuffer.toString());
    }

    /**
     * 発展プログラミング演習 練習問題8-2の起動プログラム
     */
    public void run()
    {
        this.fileNames.stream()
            .map(fileName -> new File(fileName))
            .forEach(this::readFile);
    }
}
