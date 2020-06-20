package src;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

/**
 * シーザー暗号を行うクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class CaesarCipher extends Object
{
    /**
     * 鍵の値を格納するフィールド
     */
    private Integer key = 5;

    /**
     * 暗号化するファイル名を格納するフィールド
     */
    private String inputFileName = "before.txt";

    /**
     * 暗号化したファイル名を格納するフィールド
     */
    private String outputFileName = "after.txt";

    /**
     * セパレータを出力する関数
     */
    final private Consumer<String> separater = (aString) -> System.out.println(aString + "------------------------------------------------------------");

    /**
     * 暗号化した値を返す関数
     */
    final private IntBinaryOperator encryptedNumber = (aNumber, key) -> {
        if(aNumber + key < 0){
            return 256 - aNumber + key;
        } else if(256 < aNumber + key){
            return aNumber + key - 256;
        } else {
            return aNumber + key;
        }
    };

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public CaesarCipher(String[] arguments)
    {
        if(arguments.length == 0 | arguments.length == 1){
            System.out.println("入力がありません。第1引数に「鍵の値」、第2引数に「暗号化するファイル名」、第3引数に「暗号化したファイル名」の指定をしてください。");
            System.out.println("第1引数に「5」、第2引数に「before.txt」、第3引数に「after.txt」として実行します。");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.key = Integer.valueOf(arguments[0]);
                this.inputFileName = arguments[1];
                this.outputFileName = arguments[2];
            });
        }
    }

    /**
     * 暗号化するメソッド
     * @param key 鍵の値
     * @param in 読み込みするファイルのストリーム
     * @param out 書き込むするファイルのストリーム
     */
    public void encrypt(Integer key, InputStream in, OutputStream out) throws IOException 
    {
        Integer aNumber;
        while((aNumber = in.read()) != -1) {
            out.write(this.encryptedNumber.applyAsInt(aNumber, key));
        }
    }

    /**
     * ファイルの中を標準出力するメソッド
     * @param fileName　ファイルの名前
     */
    public void printFile(String fileName)
    {
        this.separater.accept(fileName);
        try 
        { 
            ProcessBuilder catProcessBuilder = new ProcessBuilder("cat", fileName);
            Process catProcess = catProcessBuilder.start(); 

            //コマンドの出力結果をバイト単位でアクセスできるようにする。
            InputStream anInputStream = catProcess.getInputStream();
            //文字単位でアクセスできるようにする。
            InputStreamReader anInputStreamReader = new InputStreamReader(anInputStream, "UTF-8");
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
            finally 
            { 
                System.out.println();
                aBufferedReader.close(); 
            }
        }
        catch (IOException anException) { anException.printStackTrace(); }            
    }

    /**
     * 発展プログラミング演習 練習問題8-5の起動プログラム
     */
    public void run()
    {
        try
        {
            //バイト単位でアクセスできるようにする。
            FileInputStream aFileInputStream = new FileInputStream(this.inputFileName);
            //ファイルを作成し、バイト単位でアクセスできるようにする。
            FileOutputStream aFileOutputStream = new FileOutputStream(this.outputFileName);

            this.encrypt(this.key, aFileInputStream, aFileOutputStream);
            
            //閉じる
            aFileInputStream.close();
            aFileOutputStream.close();
        }
        catch (FileNotFoundException anException) { anException.printStackTrace(); }
        catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
        catch (IOException anException) { anException.printStackTrace(); }

        this.printFile(this.inputFileName);
        this.printFile(this.outputFileName);
        this.separater.accept("");
    }
}
