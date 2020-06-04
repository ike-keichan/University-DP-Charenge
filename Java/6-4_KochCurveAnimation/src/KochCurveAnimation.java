package src;

import java.awt.Color;
import java.util.stream.IntStream;

/**
 * コッホ曲線のアニメーションを描写するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class KochCurveAnimation extends Object
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
     * 発展プログラミング演習 練習問題6-4の起動プログラム
     */
    public void run() throws InterruptedException
    {
        EZ.initialize(this.width, this.height);

        Integer dimension = 0;

        while(true){
            KochCurve aKochCurve = new KochCurve(dimension);
            EZ.addText(this.width/8, this.height/8, "n = " + dimension, Color.BLACK, this.height / 10);
            aKochCurve.drawingKoch(this.xStartPoint, this.yStartPoint, this.xEndPoint, this.yEndPoint, dimension, 0.0);
            dimension++;
            if(dimension == 6){ dimension = 0;}
            Thread.sleep(1000);
            EZ.removeAllEZElements();
        }
    }
}