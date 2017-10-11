import greenfoot.*;

public class HeroClone extends Hero
{
    SimpleTimer timer = new SimpleTimer();

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
