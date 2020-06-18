package src;

/**
 * 問題
 * 本学の学生証番号（６桁）は，各桁を足し合わせると，10の倍数となるようになっています． 
 * コマンドライン引数で与えられた学生証番号が正しいものであるかを判定するプログラムStudentIdValidatorを作成してください． 
 * 正しい学生証番号であれば，与えられた学生証番号と共に，valid， 正しくない学生証番号であれば，invalid， 
 * 与えられた文字列が６桁の学生証番号でなければ，not student idと出力してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題3-2のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        StudentValidator aStudentValidator = new StudentValidator();
        aStudentValidator.run(arguments);
    }
}
