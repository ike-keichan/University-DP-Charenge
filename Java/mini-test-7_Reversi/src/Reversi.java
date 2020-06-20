package src;

import java.awt.Color;
import java.util.stream.IntStream;

/**
 * オセロを描写するクラス
 * 
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class Reversi extends Object 
{
    /**
     * キャンパスの縦の長さ
     */
    final private Integer height = 420;

    /**
     * キャンパスの縦の長さ
     */
    final private Integer width = 420;

    /**
     * 線を描写するメソッド
     */
    public void drawingLines() 
    {
        Integer x0 = this.width / 42;
        Integer y0 = this.height / 42;
        Integer size = this.width * 5 / 42;

        IntStream.rangeClosed(0, 8).forEach(index -> {
            EZ.addLine(x0 + size * index, y0, x0 + size * index, y0 + (this.height - this.height / 21), Color.GRAY);
        });

        IntStream.rangeClosed(0, 8).forEach(index -> {
            EZ.addLine(x0, y0 + size * index, x0 + (this.width - this.width / 21), y0 + size * index, Color.GRAY);
        });
    }

    /**
     * ピースを描写するメソッド
     */
    public void drawingPieces() 
    {
        EZ.addCircle(this.width * 8 / 21 + this.width * 5 / 84, this.height * 8 / 21 + this.height * 5 / 84,
                this.width * 2 / 21, this.height * 2 / 21, Color.WHITE, true);
        EZ.addCircle(this.width / 2 + this.width * 5 / 84, this.height / 2 + this.height * 5 / 84, this.width * 2 / 21,
                this.height * 2 / 21, Color.WHITE, true);
        EZ.addCircle(this.width * 8 / 21 + this.width * 5 / 84, this.height / 2 + this.height * 5 / 84,
                this.width * 2 / 21, this.height * 2 / 21, Color.BLACK, true);
        EZ.addCircle(this.width / 2 + this.width * 5 / 84, this.height * 8 / 21 + this.height * 5 / 84,
                this.width * 2 / 21, this.height * 2 / 21, Color.BLACK, true);
    }

    /**
     * 発展プログラミング演習 小テスト7の起動プログラム
     */
    public void run() 
    {
        EZ.initialize(this.width, this.height);
        EZ.addRectangle(this.width / 2, this.height / 2, this.width, this.height, Color.GREEN, true);
        this.drawingLines();
        this.drawingPieces();
    }
}
