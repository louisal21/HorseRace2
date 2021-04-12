import processing.core.PApplet;
import processing.core.PImage;

public class Horse {
    private float x;
    private float y;
    private PImage i;

    public KirbyHorse(float x, float y, PImage i) {
        this.x = x;
        this.y = y;
        i = loadImage("kirby.jpg");
    }

    public void update(PApplet sketch){
        x += 2;
        if(x > sketch.width) x = 0;
    }

    public void draw(PApplet sketch){
        sketch.fill(255,0,0);
        sketch.ellipse(x,y,40,40);
        image(i, 0, 0);
    }

}