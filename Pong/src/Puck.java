import processing.core.PApplet;

/**
 * Created by hoite on 20-6-17.
 */

public class Puck extends PApplet {
    PApplet p;

    public Puck(PApplet p) {
        this.p = p;
    }

    float x = width / 2;
    float y = height / 2;


    void show() {
        fill(255);
        ellipse(x, y, 24, 24);
    }
}