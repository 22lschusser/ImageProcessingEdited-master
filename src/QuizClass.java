import processing.core.PApplet;
import processing.core.PImage;

public class QuizClass extends Sprite {

    public int counter;

    QuizClass(PApplet _pApplet, int _x, int _y, int _width, int _height, int _identifier) {
        super(_pApplet, _x, _y, _width, _height, _identifier);
        counter = 0;
    }

    public void mouseClicked(int mouseX, int mouseY){
        counter++;

    }

    public void draw(){
        if(counter % 2 == 0){
            getPApplet().fill(255, 255, 255);
            getPApplet().ellipse((getX() + getWidth() / 2),(getY() + getHeight() / 2),getWidth(),getHeight());
        }
        else{
            getPApplet().fill(0, 0, 0);
            getPApplet().ellipse((getX() + getWidth() / 2),(getY() + getHeight() / 2),getWidth(),getHeight());
        }
    }



}
