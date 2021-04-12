import processing.core.PApplet;

public class HorseGame extends PApplet {

    private Horse h;

    public static void main(String[] args) {
        PApplet.main(new String[] {"HorseGame"});

    }

    public void settings(){
        size(888,688);
    }

    public void setup(){
        background(255,255,0);
        h = new Horse(300,200);
    }

    public void draw() {
        background(255,255,0);
        h.update(this);
        h.draw(this);
    }

}
