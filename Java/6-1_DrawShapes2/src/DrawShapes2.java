package src;

import java.awt.Color;

/**
 * 図形を描写するクラス
 * @author Keisuke Ikeda
 * @version 1.1
 */
public class DrawShapes2 extends Object
{
    /**
     * キャンパスの縦の長さ
     */
    final private Integer height = 1000;

    /**
     * キャンパスの縦の長さ
     */
    final private Integer width = 1000;

    /**
     * 図形を描写するメソッド
     */
    public void drawingShapes()
    {
        EZ.addRectangle(this.width/2, this.height/2, this.width/2, this.height/2, Color.BLUE, true);
        EZ.addLine(this.width/2, this.height/8,  this.width/8, this.height/2, Color.RED);
        EZ.addLine(this.width/8, this.height/2, this.width/2, this.height*7/8, Color.GREEN);
        EZ.addLine(this.width/2, this.height*7/8, this.width*7/8, this.height/2, Color.GRAY);
        EZ.addLine(this.width*7/8, this.height/2, this.width/2,  this.height/8, Color.ORANGE);
        EZ.addCircle(this.width/2, this.height/2, this.width/2, this.height/2, Color.WHITE, true);
    }

    /**
     * 発展プログラミング演習 練習問題6-1の起動プログラム
     */
    public void run()
    {
        EZ.initialize(this.width, this.height);
        this.drawingShapes();
    }
}
