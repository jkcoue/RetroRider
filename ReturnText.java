import greenfoot.*;

/**
 * Write a description of class ReturnText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturnText extends Texts
{
    int timer = 0;
    public void act(){
        timer++;
        if (timer == 30){
            setImage("transparent.png");
        }
        if (timer == 60){
            setImage("returnText.png");
            timer = 0;
        }
    }    
}
