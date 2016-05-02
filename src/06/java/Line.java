import java.awt.Graphics;

public class Line implements Sprite{
    private int width;
    private int height;

    public Line(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics surface, int leftX, int topY){
        surface.drawLine(leftX, topY, leftX + this.width, topY + this.height);
    }

    /** Returns the width of the sprite. */
    public int getWidth(){
        return width;
    }

    /** Returns the height of the sprite. */
    public int getHeight(){
        return height;
    }
}
