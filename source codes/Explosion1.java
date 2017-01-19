import greenfoot.*;

/**
 * Write a description of class Explosion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion1 extends Actor
{
    SimpleTimer timer = new SimpleTimer();

    /**
     * Act - do whatever the Explosion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(timer.millisElapsed() > 50){
            setImage("EnemyExplosion1.png");
        }
        if(timer.millisElapsed() > 100){
            setImage("EnemyExplosion2.png");
        }
        if(timer.millisElapsed() > 150){
            setImage("EnemyExplosion3.png");
        }
        if(timer.millisElapsed() > 200){
            setImage("EnemyExplosion4.png");
        }
        if(timer.millisElapsed() > 250){
            getWorld().removeObject(this);
        }    
    }
}
