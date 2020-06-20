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
public class MakeDirectory extends Object
{
    /**
     * 作成するディレクトリ名を格納するフィールド
     */
    private List<String> directoryNames = new ArrayList<String>();

    /**
     * セパレータを出力する関数
     */
    final private Runnable separater = () -> System.out.println("------------------------------------------------------------");

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public MakeDirectory(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がありません。引数に「作成するディレクトリ名」の指定をしてください。");
            System.out.println("引数を「hoge/」「hogehoge/」として実行します。");
            this.separater.run();
            this.directoryNames.add("hoge/");
            this.directoryNames.add("hogehoge/");
        } else {
            IntStream.range(0, arguments.length).forEach( index -> {
                this.directoryNames.add(arguments[index]);
            });
        }
    }

    /**
     * ディレクトリを作成するメソッド
     * @param aDirectory 作成するディレクトリ
     */
    public void mkdir(File aDirectory)
    {
        Boolean flag = aDirectory.mkdir();
        if(!flag){
            System.out.println(aDirectory.getPath() + ": could not make directory");
        } else {
            System.out.println(aDirectory.getPath() + ": make directory");
        }
    }

    /**
     * 発展プログラミング演習 練習問題7-2の起動プログラム
     */
    public void run()
    {
        this.directoryNames.stream()
            .map(directoryName -> new File(directoryName))
            .forEach(this::mkdir);
        this.separater.run();
    }
}
