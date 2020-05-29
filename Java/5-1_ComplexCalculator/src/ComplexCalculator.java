package src;

/**
 * 複素数を計算するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class ComplexCalculator extends Object
{
    /**
     * 複素数を格納するフィールド
     */
    private Complex firstComplex = new Complex(5.0, -6.0);

    /**
     * 複素数を格納するフィールド
     */
    private Complex secondComplex = new Complex(3.0, 2.0);

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public ComplexCalculator(String[] arguments)
    {
        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「5.0 -6.0 3.0 2.0」とします");
        }else {
            this.firstComplex.setRealNumber(Double.valueOf(arguments[0]));
            this.firstComplex.setImaginaryNumber(Double.valueOf(arguments[1]));
            this.secondComplex.setRealNumber(Double.valueOf(arguments[2]));
            this.secondComplex.setImaginaryNumber(Double.valueOf(arguments[3]));
        }
    }

    public Complex add(Complex firstComplex, Complex secondComplex){
        Double realNumber = firstComplex.getRealNumber() + secondComplex.getRealNumber();
        Double imaginaryNumber = firstComplex.getImaginaryNumber() + secondComplex.getImaginaryNumber();
        Complex resultComplex = new Complex(realNumber, imaginaryNumber);

        return resultComplex;
    }

    public Complex subtract(Complex firstComplex, Complex secondComplex){
        Double realNumber = firstComplex.getRealNumber() - secondComplex.getRealNumber();
        Double imaginaryNumber = firstComplex.getImaginaryNumber() - secondComplex.getImaginaryNumber();
        Complex resultComplex = new Complex(realNumber, imaginaryNumber);

        return resultComplex;
    }

    public Complex multiply(Complex firstComplex, Complex secondComplex){
        Double realNumber = firstComplex.getRealNumber() * secondComplex.getRealNumber() - firstComplex.getImaginaryNumber() * secondComplex.getImaginaryNumber();
        Double imaginaryNumber = firstComplex.getRealNumber() * secondComplex.getImaginaryNumber() + firstComplex.getImaginaryNumber() * secondComplex.getRealNumber();
        Complex resultComplex = new Complex(realNumber, imaginaryNumber);

        return resultComplex;
    }

    public Complex divide(Complex firstComplex, Complex secondComplex){
        Double realNumber = firstComplex.getRealNumber() * secondComplex.getRealNumber() + firstComplex.getImaginaryNumber() * secondComplex.getImaginaryNumber();
        Double imaginaryNumber = firstComplex.getRealNumber() * secondComplex.getImaginaryNumber() - firstComplex.getImaginaryNumber() * secondComplex.getRealNumber();
        Double denominator = secondComplex.getRealNumber() * secondComplex.getRealNumber() + secondComplex.getImaginaryNumber() * secondComplex.getImaginaryNumber();
        Complex resultComplex = new Complex(realNumber/denominator, imaginaryNumber/denominator);

        return resultComplex;
    }

    /**
     * 発展プログラミング演習 練習問題5-1の起動プログラム。
     */
    public void run()
    {
        this.add(this.firstComplex, this.secondComplex).prinln();
        this.subtract(this.firstComplex, this.secondComplex).prinln();
        this.multiply(this.firstComplex, this.secondComplex).prinln();
        this.divide(this.firstComplex, this.secondComplex).prinln();
    }
}