package src;

import java.awt.Color;
import java.util.stream.IntStream;

/**
 * コッホ曲線を描写するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class KochCurve extends Object
{
    /**
     * キャンパスの縦の長さ
     */
    final private Integer height = 400;

    /**
     * キャンパスの縦の長さ
     */
    final private Integer width = 400;

    /**
     * 始点のx座標を格納するフィールド
     */
    final private Integer xStartPoint = 0;

    /**
     * 始点のy座標を格納するフィールド
     */
    final private Integer yStartPoint = this.height / 2;

    /**
     * 終点のx座標を格納するフィールド
     */
    final private Integer xEndPoint = this.width;

    /**
     * 終点のy座標を格納するフィールド
     */
    final private Integer yEndPoint = this.height / 2;

    /**
     * コッホ曲線の変数nの値を格納するフィールド
     */
    private Integer dimension = 4;

    /**
     * 定数δを格納するフィールド
     */
    final private Double delta = Math.PI / 3.0;

    /**
     * コンストラクタ
     * @param arguments 引数の文字列の配列
     */
    public KochCurve(String[] arguments)
    {
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「4」とします");
        } else{
            this.dimension = Integer.valueOf(arguments[0]);
        }
    }
    
    /**
     * コッホ曲線を描写するメソッド
     * @param x1 始点のx座標
     * @param y1 始点のy座標
     * @param x5 終点のx座標
     * @param y5 終点のy座標
     * @param dimension コッホ曲線のnの値
     * @param angle 角度
     */
    public void drawingKoch(Integer x1, Integer y1, Integer x5, Integer y5, Integer dimension, Double angle)
    {
        if(dimension == 0){
            EZ.addLine(x1, y1, x5, y5, Color.RED);
        } else{
            Double length = Math.sqrt((x5 - x1) * (x5 - x1) + (y5 - y1) * (y5 - y1)) / 3.0;

            // (x2, y2) を求める．
            Double x2 = x1 + length * Math.cos(angle);
            Double y2 = y1 + length * Math.sin(angle);
            // (x1, y1)から(x2, y2)まで線を引く．
            EZ.addLine(x1.intValue(), y1.intValue(), x2.intValue(), y2.intValue(), Color.RED);

            // (x3, y3) を求める（θ は angle + delta）．
            Double x3 = x2 + length * Math.cos(angle + this.delta);
            Double y3 = y2 + length * Math.sin(angle + this.delta);
            this.drawingKoch(x2.intValue(), y2.intValue(), x3.intValue(), y3.intValue(), dimension - 1, angle + this.delta);

            // (x4, y4) を求める（θ は angle - delta）．
            Double x4 = x3 + length * Math.cos(angle - this.delta);
            Double y4 = y3 + length * Math.sin(angle - this.delta);
            this.drawingKoch(x3.intValue(), y3.intValue(), x4.intValue(), y4.intValue(), dimension - 1, angle - this.delta);

            // (x4, y4)から(x5, y5)まで線を引く．
            EZ.addLine(x4.intValue(), y4.intValue(), x5.intValue(), y5.intValue(), Color.RED);
        }
    }

    /**
     * 発展プログラミング演習 練習問題6-3の起動プログラム
     */
    public void run()
    {
        EZ.initialize(this.width, this.height);
        this.drawingKoch(this.xStartPoint, this.yStartPoint, this.xEndPoint, this.yEndPoint, this.dimension, 0.0);
    }
}
