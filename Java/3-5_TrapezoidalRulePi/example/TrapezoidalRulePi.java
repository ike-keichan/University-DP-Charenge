package example;

public class TrapezoidalRulePi extends Object
{
    /**
     * 台形の横幅を記憶するフィールド
     */
    private Double width = 0.001;

    /**
     * 台形の面積の総和を記憶するフィールド
     */
    private Double sum = 0.0;

    /**
     * 発展プログラミング演習 練習問題3-5の起動プログラム。
     * @param arguments 引数の文字列の配列
     */
    public void run(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「0.001」とします");
        }else {
            this.width = Double.valueOf(arguments[0]);
        }

        //Printクラスのインスタンス化
        Print aPrint = new Print();

        //出力
        aPrint.printAnswer(this.getApproximation());
    }

    /**
     * 台形の面積を算出し、足し合わせてπの近似値を算出するプログラム。
     * @return πの近似値
     */
    public Double getApproximation()
    {
        Double sum = 0.0;
        for(Double index = this.width; index < 1.0; index += this.width){
            Double left = Math.sqrt(1 - (index - this.width) * (index - this.width));
            Double right = Math.sqrt(1 - index * index);

            //面積の算出。
            Double trapezoidArea = (left + right) * width / 2;

            //算出した面積を足す。．
            this.sum += trapezoidArea;
        }

        return this.sum * 4;
    }

    /**
     * 発展プログラミング演習 練習問題3-5のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(String[] arguments)
    {
        TrapezoidalRulePi aTrapezoidalRulePi = new TrapezoidalRulePi();
        aTrapezoidalRulePi.run(arguments);
    }
}
