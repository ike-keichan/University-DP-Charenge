package src;

/**
 * 問題
 * 線形合同法（Linear Congruential Generators）を用いて，0〜1の範囲の乱数をコマンドライン引数で指定された数だけ求めてください． 
 * コマンドライン引数で何も指定されなかった場合は，10が指定されたものとしてください．
 * 線形合同法は，擬似乱数を発生させるアルゴリズムです．以下の漸化式で求めます．
 * Xn+1=(A×Xn+B)modM
 * A，B，Mは定数です．Aは自分の誕生日（月日．3桁もしくは4桁），Bは1， Mは65535，X0は自分の年齢としてください． 
 * 完成すれば，A，B，M，X0の値を変更して結果がどのように変わるかを確認しましょう． ただし，A<M，B<Mである必要があります．
 */

/**
 * メインクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Main extends Object
{
    /**
	 * 発展プログラミング演習 練習問題5-5のメインプログラム
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
    {
        LinearCongruentialGenerator aLinearCongruentialGenerator = new LinearCongruentialGenerator(arguments);
        aLinearCongruentialGenerator.run();
	}
}
