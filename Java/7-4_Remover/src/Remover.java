package src;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Process;
import java.lang.ProcessBuilder;
import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * ファイルを削除するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Remover extends Object
{
    /**
     * 削除するファイル名を格納するフィールド
     */
    private List<String> fileNames = new ArrayList<String>();

    /**
     * セパレータを出力する関数
     */
    final private Consumer<String> separater = (aString) -> System.out.println(aString + "------------------------------------------------------------");

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     * @throws IOException 無視する
     */
    public Remover(String[] arguments) throws IOException
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。第一引数に「削除するディレクトリ・ファイル名」の指定をしてください。");
            System.out.println("ファイル「hoge1.txt」「dir/hoge2.txt」を作成後、引数を「hoge1.txt」「dir/」として実行します。");

            ProcessBuilder mkdirProcessBuilder = new ProcessBuilder("mkdir", "dir/");
            ProcessBuilder touchProcess1Builder = new ProcessBuilder("touch", "hoge1.txt");
            ProcessBuilder touchProcess2Builder = new ProcessBuilder("touch", "dir/hoge2.txt");
            Process mkdirProcess = mkdirProcessBuilder.start();
            Process touchProcess1 = touchProcess1Builder.start();
            Process touchProcess2 = touchProcess2Builder.start();

            this.fileNames.add("hoge1.txt");
            this.fileNames.add("dir/");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.fileNames.add(arguments[index]);
            });
        }
    }

    /**
     * ディレクトリ・ファイルを削除するメソッド
     * @param aFile 削除するディレクトリ・ファイル
     */
    public void remove(File aFile)
    {
        if(aFile.isDirectory()){
            Stream.of(aFile.listFiles()).forEach(this::remove);
            aFile.delete();
        } else {
            aFile.delete();
        }
    }

    /**
	 * コマンドの標準出力ストリームを受け取り、それを読み取って、自分の標準出力に書き出す。
	 * @param aStream 標準出力ストリーム
	 * @throws IOException 無視する
	 */
	public void printStream(InputStream aStream) throws IOException
	{
		InputStreamReader aReader = new InputStreamReader(aStream, "UTF-8");
		BufferedReader aBufferedReader = new BufferedReader(aReader);
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
    
    /**
     * 今のディレクトリの状態を表示するメソッド
     * @throws IOException　無視する
     */
    public void lsDirectory(String aString) throws IOException
    {
        this.separater.accept(aString);
        ProcessBuilder lsProcessBuilder = new ProcessBuilder("ls", "-l", ".");
        Process aProcess = lsProcessBuilder.start();

        InputStream aStream = aProcess.getInputStream();
        this.printStream(aStream);
    }

    /**
     * 発展プログラミング演習 練習問題7-4の起動プログラム
     */
    public void run() throws IOException
    {
        this.lsDirectory("before");

        this.fileNames.stream()
            .map( fileName -> new File(fileName) )
            .forEach(this::remove);

        this.lsDirectory("after");
        this.separater.accept("");
    }
}
