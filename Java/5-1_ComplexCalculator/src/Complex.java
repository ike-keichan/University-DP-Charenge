package src;

/**
 * 複素数を表現するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class Complex extends Object
{
    /**
     * 実数を格納するフィールド
     */
    private Double realNumber;

    /**
     * 虚数を格納するフィールド
     */
    private Double imaginaryNumber;

    /**
     * コンストラクタ
     * @param realNumber 実数
     * @param imaginaryNumber 虚数
     */
    public Complex(Double realNumber, Double imaginaryNumber)
    {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * 実数の値を変更するセッターメソッド
     * @param realNumber 実数
     */
    public void setRealNumber(Double realNumber)
    {
        this.realNumber = realNumber;
    }
    
    /**
     * 虚数の値を変更するセッターメソッド
     * @param imaginaryNumber 虚数
     */
    public void setImaginaryNumber(Double imaginaryNumber)
    {
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * 実数の値を取得するゲッターメソッド
     */
    public Double getRealNumber()
    {
        return this.realNumber;
    }
    
    /**
     * 虚数の値を取得するセッターメソッド
     */
    public Double getImaginaryNumber()
    {
        return this.imaginaryNumber;
    }

    /**
     * 複素数を改行なしで表示するメソッド
     */
    public void print()
    {
        System.out.printf("%5.2f + %5.2f i", this.realNumber, this.imaginaryNumber);
    }

    /**
     * 複素数を改行ありで表示するメソッド
     */
    public void prinln()
    {
        this.print();
        System.out.println("");
    }

    /**
     * 複素数を文字列に変換するメソッド
     */
    public String toString(){
        return String.format("%5.2f + %5.2f i", this.realNumber, this.imaginaryNumber);
    }
}
