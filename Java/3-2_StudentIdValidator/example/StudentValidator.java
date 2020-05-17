package example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentValidator extends Object
{
    /**
     * 発展プログラミング演習 練習問題3-2の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「744069」とします");
            this.validate("744069");
        }

        //コマンドライン引数の文字列の配列をvalidateに一つずつ受け渡す
        for(final String argument: arguments){
            this.validate(argument);
        }
    }

    /**
     * 入力された番号が学籍番号であるかを判別するプログラム。
     * @param id 番号の文字列
     */
    public void validate(String id)
    {

        //学籍番号が６桁でない場合の出力
        if(id.length() != 6){
            System.out.println("not student id");
            return;
        }

        //学生かどうかを判別
        if(this.validateId(Integer.valueOf(id))){
            System.out.println(id + "：valid");
        }else {
            System.out.println(id + "：invalid");
        }

    }

    /**
     * 入力された番号の合計値が10の倍数であるかを判定するプログラム
     * @param id 番号の数字
     * @return 合計値を10で割り切れるかどうかの真偽値
     */
    public Boolean validateId(Integer id)
    {
        Integer sum = 0;
        for(Integer index = 0; index < 6; index++){
            sum += Integer.valueOf(String.valueOf(id).substring(index, index+1));
        }
        return sum % 10 == 0;
    }

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
