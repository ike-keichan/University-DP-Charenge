package src;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * ファイルを探索するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class FileFinder extends Object
{
    /**
     * 探索するファイル名を格納するフィールド
     */
    private String fileName = new String();

    /**
     * 探索するディレクトリ名を格納するフィールド
     */
    private String directoryName = new String();

    /**
     * ディレクトリ構造を記憶するフィールド
     */
    private List<File> directoryTree = new ArrayList<File>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public FileFinder(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。第一引数に「ファイル名」、第二引数に「探索するディレクトリ名」の指定をしてください。");
        } else {
            this.fileName = arguments[0];
            this.directoryName = arguments[1];
        }
    }

    /**
     * ファイルを探索するメソッド
     * @param fileName 探索するファイル名
     * @param directory 探索を行うディレクトリ
     */
    public void findFile(String fileName, File directory)
    {
        if(directory.isDirectory()){
            File[] files = directory.listFiles();
            Stream.of(files).forEach( file -> {
                this.findFile(fileName , file);
            });
        } else {
            if(fileName.equals(directory.getName()))
            {
                this.directoryTree.add(directory);
            }
        }
    }

    /**
     * 発展プログラミング演習 練習問題7-1の起動プログラム
     */
    public void run()
    {
        File aFile = new File(this.directoryName);
        this.findFile(this.fileName, aFile);

        this.directoryTree.forEach( file -> {
            System.out.println(file.getPath());
        });
    }
}
