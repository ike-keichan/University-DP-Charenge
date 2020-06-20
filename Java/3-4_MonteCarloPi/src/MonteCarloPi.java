package src;

import java.util.stream.IntStream;

/**
 * モンテカルロ法によるπの計算を行うクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class MonteCarloPi extends Object
{
    /**
     * ループ回数をInteger型で記憶するフィールド
     */
    private Integer aNumber = 1000;

    /**
     * 円への衝突回数を記憶するフィールド
     */
    private Integer hitCount = 0;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public MonteCarloPi(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「1000」とします");
        }else {
            this.aNumber = Integer.valueOf(arguments[0]);
        }
    }

    /**
     * 円への衝突回数をカウントし、πの近似値を算出するプログラム。
     * @return  モンテカルロ法によって算出されたπの近似値
     */
    public Double getApproximation()
    {
        IntStream.range(0, this.aNumber).forEach(index -> {
            //乱数を生成
            Double variableX = Math.random();
            Double variableY = Math.random();

            //2点間の距離を計算
            Double length = Math.sqrt(variableX * variableX + variableY * variableY);

            //円に衝突しているか判別
            if(length < 1.0){
                hitCount += 1;
            }
        });
        
        return hitCount * 4.0 / aNumber;
    }

    /**
     * 発展プログラミング演習 練習問題3-4の起動プログラム。
     */
    public void run()
    {
        //Printクラスのインスタンス化
        Print aPrint = new Print();
        aPrint.printAnswer(this.getApproximation());
    }
}
