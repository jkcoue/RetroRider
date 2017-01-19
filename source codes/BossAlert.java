import greenfoot.*;

/**
 * Write a description of class BossAlert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossAlert extends Texts
{
    int timer = 0;
    public void act(){
        timer++;
        if (timer == 30){
            setImage("transparent.png");
        }
        if (timer == 60){
            setImage("bossAlert.png");
            timer = 0;
        }
    }
}
