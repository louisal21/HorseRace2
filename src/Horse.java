import processing.core.PApplet;

public class Horse {
    private float x;
    private float y;

    public Horse(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void update(PApplet sketch){
        x += 2;
        if(x > sketch.width) x = 0;
    }

    public void draw(PApplet sketch){
        sketch.fill(255,0,0);
        sketch.ellipse(x,y,40,40);
    }


}
