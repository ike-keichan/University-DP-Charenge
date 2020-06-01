package src;

/**
 * 問題
 * ExamScore型を作成してください．
 *      Integer型のmath
 *      Integer型のphysics
 *      Integer型のenglish
 *      String型のnameをフィールドに持ちます．
 * ExamAnalyzerに次のメソッド，処理を追加してください．
 *      runメソッドを作成してください．引数，返り値はなしで構いません．
 *      3つのInteger型，1つのString型を受け取り，ExamScoreを返す createExamScoreメソッドを定義してください．
 *          メソッドのボディで，ExamScoreの実体を作成し，引数の値を作成したExamScoreの実体のフィールドに代入してください．
 *          代入が終了した ExamScoreの実体を返してください．
 *      runメソッド内で次の処理を行ってください．
 *          ExamScore型の実体を格納するArrayListの実体を作成してください．
 *          createRandomScoreメソッドを用いて，ランダムな成績を10個作成してください．
 *          名前は数値の連番（"0"〜"9"）にしましょう．
 *          Integer型変数intValueをString型に変換するには，"" + intValueもしくは，intValue.toString()としてください．
 *          作成したArrayListに上記で作成したランダムな成績を追加してください．
 *          全員のmath，physics，englishごとに平均値，最大値，最小値を求めてください．
 *          それぞれExamScoreの実体に対して，math，physics，englishの平均値を求めてください．
 *          求めた値を出力してください．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Main extends Object
{
    /**
     * 発展プログラミング演習 練習問題4-4のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        ExamAnalyzer aExamAnalyzer = new ExamAnalyzer();
        aExamAnalyzer.run();
    }
}
