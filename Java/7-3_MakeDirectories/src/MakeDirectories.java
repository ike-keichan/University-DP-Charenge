package src;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * ディレクトリを作成するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class MakeDirectories extends Object
{
    /**
     * 作成するディレクトリ名を格納するフィールド
     */
    private List<String> directoryNames = new ArrayList<String>();

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public MakeDirectories(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。第一引数に「作成するディレクトリ名」の指定をしてください。");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.directoryNames.add(arguments[index]);
            });
        }
    }

    /**
     * ディレクトリを作成するメソッド
     * @param directory 作成するディレクトリ名
     */
    public void mkdir(String directory)
    {
        File aFile = new File(directory);
        Boolean flag = aFile.mkdirs();
        if(!flag){
            System.out.println(aFile.getPath() + ": could not make directory");
        }
    }

    /**
     * 発展プログラミング演習 練習問題7-3の起動プログラム
     */
    public void run()
    {
        this.directoryNames.forEach(this::mkdir);
    }
}
