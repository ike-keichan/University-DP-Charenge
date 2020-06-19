package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Process;
import java.lang.ProcessBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 標準入力で受け取った文字列を標準出力とファイルに出力するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Tee extends Object
{
    /**
     * 作成するファイル名を格納するフィールド
     */
    private List<String> fileNames = new ArrayList<String>();

    /**
     * 標準入力の値を格納するフィールド
     */
    private List<String> inputStrings = new ArrayList<String>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Tee(String[] arguments)
    {
        if(arguments.length == 0 | arguments.length == 1){
            System.out.println("入力がありません。標準入力をパイプでつなぎ、引数に「作成するファイル名」の指定をしてください。");
            System.out.println("引数を「hoge1.txt」「hoge2.txt」として実行します。");
            System.out.println("------------------------------------------------------------");
            this.fileNames.add("hoge1.txt");
            this.fileNames.add("hoge2.txt");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.fileNames.add(arguments[index]);
            });
        }
    }

    /**
     * 標準出力を読み込むメソッド
     * @param fileName 書き込みをするファイル
     */
    public void readSystem()
    {
        try
        {
            //標準出力を文字単位でアクセスできるようにする。
            InputStreamReader anInputStreamReader = new InputStreamReader(System.in);
            //バッファを用いたリーダを用意する。高速に読むことが可能。
            BufferedReader aBufferedReader = new BufferedReader(anInputStreamReader);

            String aString = null;

            while ((aString = aBufferedReader.readLine()) != null) // 一行ずつ読み込みます。
			{
                this.inputStrings.add(aString);
			}

            //バッファを閉じる
            aBufferedReader.close(); 
        }
		catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
        catch (IOException anException) { anException.printStackTrace(); }
    }

    /**
     * 標準入力をファイル出力するメソッド
     */
    public void writeFile()
    {
        this.fileNames.stream()
            .forEach(fileName -> {
                try
                {
                    //ファイルを作り、バイト単位でアクセスできるようにする。
                    FileOutputStream aFileOutputStream = new FileOutputStream(fileName);
                    //文字単位でアクセスできるようにする。
                    OutputStreamWriter anOutputStreamWriter = new OutputStreamWriter(aFileOutputStream, "UTF-8");
                    //バッファを用いたリーダを用意する。高速に書くことが可能。
                    BufferedWriter aBufferedWriter = new BufferedWriter(anOutputStreamWriter);
                    
                    this.inputStrings.forEach( aString -> {
                        try
                        {
                            aBufferedWriter.write(aString);
                            aBufferedWriter.newLine();
                        }
                        catch (IOException anException) { anException.printStackTrace(); }
                    });

                    //バッファを閉じる
                    aBufferedWriter.close();
                }
                catch (FileNotFoundException anException) { anException.printStackTrace(); }
                catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
                catch (IOException anException) { anException.printStackTrace(); }
            });
        
    }

    /**
     * 標準入力を標準出力するメソッド
     */
    public void printSystem()
    {
        this.inputStrings.forEach(System.out::println);
    }

    /**
     * ファイルの中を標準出力するメソッド
     */
    public void printFile()
    {
        this.fileNames.forEach(fileName -> {
            System.out.println(fileName + "------------------------------------------------------------");
            try 
            { 
                ProcessBuilder catProcessBuilder = new ProcessBuilder("cat", fileName);
                Process catProcess = catProcessBuilder.start(); 

                //コマンドの出力結果をバイト単位でアクセスできるようにする。
                InputStream anInputStream = catProcess.getInputStream();
                //文字単位でアクセスできるようにする。
                InputStreamReader anInputStreamReader = new InputStreamReader(anInputStream);
                //バッファを用いたリーダを用意する。高速に読むことが可能。
                BufferedReader aBufferedReader = new BufferedReader(anInputStreamReader);

                try
                {
                    while (true)
                    {
                        String lineString = aBufferedReader.readLine();
                        if (lineString == null) { break; }
                        System.out.println(lineString);
                    }
                }
                finally { aBufferedReader.close(); }
            }
            catch (IOException anException) { anException.printStackTrace(); }            
        });
    }

    /**
     * 発展プログラミング演習 練習問題8-4の起動プログラム
     */
    public void run() throws IOException
    {
        this.readSystem();
        this.printSystem();
        this.writeFile();
        this.printFile();
    }
}
