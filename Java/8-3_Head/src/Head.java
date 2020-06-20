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
 * ファイルの中を行数指定で閲覧するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Head extends Object
{
    /**
     * 探索する文字列を格納するフィールド
     */
    private Integer lineNumber = 20;

    /**
     * 閲覧するファイル名を格納するフィールド
     */
    private List<String> fileNames = new ArrayList<String>();

    /**
     * セパレータを出力する関数
     */
    final private Runnable separater = () -> System.out.println("------------------------------------------------------------");

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Head(String[] arguments)
    {
        if(arguments.length == 0 | arguments.length == 1){
            System.out.println("入力がありません。第一引数に「表示する行数」、第二引数に「閲覧するファイル名」の指定をしてください。");
            System.out.println("第一引数を「20」、第二引数以降を「./src/Main.java」「./src/Head.java」として実行します。");
            this.separater.run();
            this.fileNames.add("./src/Main.java");
            this.fileNames.add("./src/Head.java");
        } else {
            this.lineNumber = Integer.valueOf(arguments[0]);
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
            Integer index = 0;

            while ((aString = aBufferedReader.readLine()) != null) // 一行ずつ読み込みます。
			{
                index++;
                this.printFile(index, aString);
                if(index == lineNumber){ break; }
            }
            
            this.separater.run();

            //ファイルを閉じる
            aBufferedReader.close(); 
        }
        catch (FileNotFoundException anException) { anException.printStackTrace(); }
		catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
        catch (IOException anException) { anException.printStackTrace(); }
    }

    /**
     * ファイルの中を標準出力するメソッド
     * @param lineNumber 行番号
     * @param aString ファイルの各行の文字列
     */
    public void printFile(Integer lineNumber, String aString)
    {
        //出力
        final StringBuffer aBuffer = new StringBuffer();
        aBuffer.append(String.format("%3d", lineNumber));
        aBuffer.append("：");
        aBuffer.append(aString);
        System.out.println(aBuffer.toString());
    }

    /**
     * 発展プログラミング演習 練習問題8-3の起動プログラム
     */
    public void run()
    {
        this.fileNames.stream()
            .map(fileName -> new File(fileName))
            .forEach(this::readFile);
    }
}
