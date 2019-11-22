package example;

public class LeapYear extends Object
{
    /**
     * 発展プログラミング演習 練習問題1-3のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        // 判定する年を宣言
        Integer year = 2019;

        // うるう年の判定用の変数の宣言
        Boolean leapYear = false;
        leapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        // うるう年の判定
        if(leapYear){
            System.out.println(year + "年はうるう年です．");
        }
        else{
            System.out.println(year + "年はうるう年ではありません．");
        }

    }
}
