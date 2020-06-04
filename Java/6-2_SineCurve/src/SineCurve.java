package src;

import java.awt.Color;
import java.util.stream.IntStream;

/**
 * サイン波を描写するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class SineCurve extends Object
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
     * 定数δを格納するフィールド
     */
    final private Double delta = (2 * Math.PI) / this.width;

    /**
     * 定数sを格納するフィールド
     */
    final private Double sValue = this.height / (2 * Math.PI);

    /**
     * 線を描写するメソッド
     */
    public void drawingLine()
    {
        EZ.addLine(0, this.height/2, this.width, this.height/2, Color.GRAY);
        EZ.addLine(this.width/2, 0, this.width/2, this.height, Color.GRAY);
    }

    /**
     * サイン波を描写するメソッド
     */
    public void drawingSinWave()
    {
        IntStream.rangeClosed(0, this.width).forEach(index -> {
            Double yStartPoint = Math.sin(index * this.delta) * this.sValue;
            Double yEndPoint = Math.sin((index + 1) * this.delta) * this.sValue;
            EZ.addLine(index, yStartPoint.intValue() + this.height / 2, index + 1, yEndPoint.intValue() + this.height / 2, Color.RED);
        });
    }

    /**
     * 発展プログラミング演習 練習問題6-2の起動プログラム
     */
    public void run()
    {
        EZ.initialize(this.width, this.height);
        this.drawingLine();
        this.drawingSinWave();
    }
}
