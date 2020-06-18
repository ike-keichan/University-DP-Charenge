package src;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ディレクトリを削除するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Remover extends Object
{
    /**
     * 削除するディレクトリ・ファイル名を格納するフィールド
     */
    private List<String> deletingFileNames = new ArrayList<String>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public Remover(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。第一引数に「削除するディレクトリ・ファイル名」の指定をしてください。");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.deletingFileNames.add(arguments[index]);
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
     * 発展プログラミング演習 練習問題7-4の起動プログラム
     */
    public void run()
    {
        this.deletingFileNames.stream().map( deletingFileName -> new File(deletingFileName) ).forEach(this::remove);
    }
}
