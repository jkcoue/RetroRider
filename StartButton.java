import greenfoot.*;

/**
 * Write a description of class StartTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Texts
{
    int timer = 0;
    public void act(){
        timer++;
        if (timer == 30){
            setImage("transparent.png");
        }
        if (timer == 60){
            setImage("introStart1.png");
            timer = 0;
        }
    }
}
