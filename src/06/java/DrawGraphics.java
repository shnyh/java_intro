import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movingSprites;
    Line line;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        movingSprites = new ArrayList<Mover>();
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Bouncer movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);
        movingSprites.add(movingSprite);
        movingSprite = new Bouncer(10, 70, box);
        movingSprite.setMovementVector(3, 1);
        movingSprites.add(movingSprite);
        line = new Line(100, 50);
        StraightMover straightMover = new StraightMover(100, 170, box);
        straightMover.setMovementVector(2, 1);
        movingSprites.add(straightMover);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for ( Mover movingSprite: movingSprites) {
            movingSprite.draw(surface);
        }
        line.draw(surface, 10, 10);
    }
}
