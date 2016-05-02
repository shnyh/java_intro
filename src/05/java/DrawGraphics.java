/*
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawGraphics {
    List<BouncingBox> boxes;


    public DrawGraphics() {
        boxes = new ArrayList<BouncingBox>();
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(120, 50, Color.RED));
        boxes.add(new BouncingBox(50, 50, Color.RED));
    }

    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        for ( BouncingBox box: boxes){
            box.draw(surface);
        }
    }
}
*/