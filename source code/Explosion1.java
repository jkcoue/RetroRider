import greenfoot.*;

public class Explosion1 extends Actor
{
    SimpleTimer timer = new SimpleTimer();

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
