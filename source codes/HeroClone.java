import greenfoot.*;

/**
 * Write a description of class HeroClone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroClone extends Hero
{
    SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the HeroClone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getX() < 400){
            move(1);
        }
        if(timer.millisElapsed() > 50){
            setImage("heroBike1.png");
        }
        if(timer.millisElapsed() > 100){
            setImage("heroBike2.png");
        }
        if(timer.millisElapsed() > 150){
            setImage("heroBike3.png");
            timer.mark();
        }
    }    
}
