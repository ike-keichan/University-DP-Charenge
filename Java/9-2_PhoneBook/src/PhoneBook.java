package src;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 電話帳を扱うクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class PhoneBook extends Object
{
    /**
     * 電話帳のデータベース、電話番号と氏名を紐つけるフィールド
     */
    private Map<String, String> phoneBook = new HashMap<String, String>();

    /**
     * listを構文解析する関数
     */
    final private Consumer<String[]> listPaser = (anArray) -> { if(anArray[0].equals("list")){ this.list(); } };

    /**
     * addを構文解析する関数
     */
    final private Consumer<String[]> addPaser = (anArray) -> { if(anArray[0].equals("add")){ this.add(anArray[1], anArray[2]);} };

    /**
     * findを構文解析する関数
     */
    final private Consumer<String[]> findPaser = (anArray) -> { if(anArray[0].equals("find")){ this.find(anArray[1]); } };

    /**
     * removeを構文解析する関数
     */
    final private Consumer<String[]> removePaser = (anArray) -> { if(anArray[0].equals("remove")){ this.remove(anArray[1]); } };

    /**
     * 構文解析
     * @param line 標準入力
     * @return 入力ループの制御　trueなら終了
     */
    public Boolean parser(String line){
        String[] items = line.split(" ");
        this.listPaser.accept(items);
        this.addPaser.accept(items);
        this.findPaser.accept(items);
        this.removePaser.accept(items);
        if(items[0].equals("quit")){
            return true;
        };
        return false;
    }

    /**
     * データベースに登録されている値を全てリストするメソッド
     */
    public void list(){
        this.phoneBook.entrySet()
            .stream()
            .map(item -> item.getKey() + "：" + item.getValue())
            .forEach(System.out::println);
    }

    /**
     * データベースの任意の値を出力するメソッド
     * @param name 出力する値のキー、名前
     * @param phoneNumber 出力する値、電話番号
     */
    public void printItem(String name, String phoneNumber){
        System.out.println(name + "：" + phoneNumber);
    }

    /**
     * データベースに任意の値を登録するメソッド
     * @param name 登録する値のキー、名前
     * @param phoneNumber 登録する値、電話番号
     */
    public void add(String name, String phoneNumber){
        this.phoneBook.put(name, phoneNumber);
    }

    /**
     * データベースに任意の値があるか探索するメソッド
     * @param name 探索する値のキー、名前
     */
    public void find(String name)
    {
        String phoneNumber = this.phoneBook.get(name);
        if(phoneNumber != null){ this.printItem(name, phoneNumber); }
    }

    /**
     * データベースから任意の値を取り除くメソッド
     * @param name 取り除く値のキー、名前
     */
    public void remove(String name)
    {
        this.phoneBook.remove(name);
    }

    /**
     * データベースの初期化を行うメソッド
     */
    public void initialize()
    {
        this.phoneBook = new HashMap<String, String>();
    }

    /**
     * 発展プログラミング演習 練習問題9-2の起動プログラム
     * @throws IOException 無視する
     */
    public void run() throws IOException
    {
        this.initialize();

        SimpleConsole console = new SimpleConsole();

        while(true){
            System.out.print("> ");
            String line = console.readLine();
            if(this.parser(line)){ break; }
        }

        console.close();
    }
}
