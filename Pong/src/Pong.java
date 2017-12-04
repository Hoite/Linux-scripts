import processing.core.PApplet;

/**
 * Created by hoite on 20-6-17.
 */
public class Pong extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Pong", args);
    }


    Puck puck;


    public void setup() {
        background(255);
        puck = new Puck(this);
    }

    public void settings() {
        size(600,400);
    }



   public void draw() {
        background(0);
        puck.show();
    }





}
