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
     * 定数δを格納するフィールド
     */
    final private Double delta = (2 * Math.PI) / 400;

    /**
     * 定数sを格納するフィールド
     */
    final private Double sValue = 400 / (2 * Math.PI);

    /**
     * 線を描写するメソッド
     */
    public void drawingLine()
    {
        EZ.addLine(0, 200, 400, 200, Color.GRAY);
        EZ.addLine(200, 0, 200, 400, Color.GRAY);
    }

    /**
     * サイン波を描写するメソッド
     */
    public void drawingSinWave()
    {
        IntStream.rangeClosed(0, 400).forEach(index -> {
            Double yStartPoint = Math.sin(index * this.delta) * this.sValue;
            Double yEndPoint = Math.sin((index + 1) * this.delta) * this.sValue;
            EZ.addLine(index, yStartPoint.intValue() + 200, index + 1, yEndPoint.intValue() + 200, Color.RED);
        });
    }

    /**
     * 発展プログラミング演習 練習問題6-1の起動プログラム
     */
    public void run()
    {
        EZ.initialize(400, 400);
        this.drawingLine();
        this.drawingSinWave();
    }
}
