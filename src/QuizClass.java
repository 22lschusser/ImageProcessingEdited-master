import processing.core.PApplet;
import processing.core.PImage;

public class QuizClass extends Sprite {

    public static int COUNTER;

    QuizClass(PApplet _pApplet, int _x, int _y, int _width, int _height, int _identifier) {
        super(_pApplet, _x, _y, _width, _height, _identifier);
    }

    public void mouseClicked(int mouseX, int mouseY){
        COUNTER++;

    }

    public void draw(){
        if(COUNTER % 2 == 0){
            getPApplet().fill(255, 255, 255);
            getPApplet().ellipse((getX() + getWidth() / 2),(getY() + getHeight() / 2),getWidth(),getHeight());
            getPApplet().noFill();
        }
        else{
            getPApplet().fill(0, 0, 0);
            getPApplet().ellipse((getX() + getWidth() / 2),(getY() + getHeight() / 2),getWidth(),getHeight());
            getPApplet().noFill();
        }
    }



}
