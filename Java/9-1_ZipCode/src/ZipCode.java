package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/**
 * 郵便番号を読み込み，検索を行うクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class ZipCode extends Object
{
    /**
     * 検索する郵便番号を格納するフィールド
     */
    private List<Integer> addressNumbers = new ArrayList<Integer>();

    /**
     * 郵便番号と住所を紐つけて格納するフィールド
     */
    private Map<Integer, String> addressMap = new HashMap<Integer, String>();

    /**
     * 郵便番号を受け取り、任意の文字列を返す関数
     */
    final private IntFunction<String> address = (addressNumber) -> { 
        if(this.addressMap.get(addressNumber) == null){ return " 見つかりませんでした"; }
        return this.addressMap.get(addressNumber);
    };

    /**
     * 正規表現でダブルクォートを取り除く関数
     */
    final private Function<String, String> stripQuote = (aString) -> {
        if(aString.matches("\".*\"")){ return aString.substring(1, aString.length() - 1); }
        return aString;
    };

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public ZipCode(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。引数に「郵便番号」の指定をしてください。");
            System.out.println("引数を「5340000」「5850054」として実行します。");
            this.addressNumbers.add(5340000);
            this.addressNumbers.add(5850054);
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.addressNumbers.add(Integer.valueOf(arguments[index]));
            });
        }
    }

    /**
     * CSVファイルを読み込むメソッド
     */
    public void readCsv()
    {
        // 環境依存しないように求める。
        String currentDirectory = System.getProperty("user.dir");
        System.out.printf("カレントディレクトリは「%s」です。%n", currentDirectory);
        
		// java.io.File.separatorを用いて結合。
		String csvFileName = currentDirectory.concat(File.separator.concat("zipcode.csv"));
        System.out.printf("目的のCSVファイルは「%s」になります。%n", csvFileName);
        
        try
        {
            //バイト単位でアクセスできるようにする。
            FileInputStream aFileInputStream = new FileInputStream(csvFileName);
            //文字単位でアクセスできるようにする。
            InputStreamReader anInputStreamReader = new InputStreamReader(aFileInputStream, "UTF-8");
            //バッファを用いたリーダを用意する。高速に読むことが可能。
            BufferedReader aBufferedReader = new BufferedReader(anInputStreamReader);

            String aString = null;

            while ((aString = aBufferedReader.readLine()) != null) // 一行ずつ読み込みます。
			{
                String[] anArray = aString.split("[,]"); // カンマで分割します。
                this.addressMap.put(Integer.valueOf(this.stripQuote.apply(anArray[2])), this.stripQuote.apply(anArray[6]) + this.stripQuote.apply(anArray[7]) + this.stripQuote.apply(anArray[8]));
            }

            //ファイルを閉じる
            aBufferedReader.close(); 
        }
        catch (FileNotFoundException anException) { anException.printStackTrace(); }
		catch (UnsupportedEncodingException anException) { anException.printStackTrace(); }
        catch (IOException anException) { anException.printStackTrace(); }
    }

    /**
     * 住所を検索するメソッド
     * @param addressNumber 郵便番号
     */
    public void seachAddress(Integer addressNumber)
    {
        System.out.println(addressNumber + ":" + address.apply(addressNumber));
    }
    

    /**
     * 発展プログラミング演習 練習問題9-1の起動プログラム
     */
    public void run()
    {
        this.readCsv();
        this.addressNumbers.forEach(this::seachAddress);
    }
}
