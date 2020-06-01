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
     * 図形を描写するメソッド
     */
    public void drawingShapes()
    {
        EZ.addRectangle(200, 200, 200, 200, Color.BLUE, true);
        EZ.addLine(200,  50,  50, 200, Color.RED);
        EZ.addLine( 50, 200, 200, 350, Color.GREEN);
        EZ.addLine(200, 350, 350, 200, Color.GRAY);
        EZ.addLine(350, 200, 200,  50, Color.ORANGE);
        EZ.addCircle(200, 200, 200, 200, Color.WHITE, true);
    }

    /**
     * 発展プログラミング演習 練習問題6-1の起動プログラム
     */
    public void run()
    {
        EZ.initialize(400, 400);
        this.drawingShapes();
    }
}
