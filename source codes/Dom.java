import greenfoot.*;

public class Dom extends Enemy2
{
    SimpleTimer timer = new SimpleTimer(); //shooting
    SimpleTimer timer2 = new SimpleTimer(); //animation

    public void act() 
    {
        enemy2Move();
        if(timer.millisElapsed() > 300){
            setImage("dom1.png");
            timer.mark();
        }
        if (Greenfoot.getRandomNumber(150) == 100){
            domShoot();
        }
        remove();
        if(timer2.millisElapsed() > 50){
            setImage("dom1.png");
        }
        if(timer2.millisElapsed() > 100){
            setImage("dom2.png");
        }
        if(timer2.millisElapsed() > 150){
            setImage("dom3.png");
            timer2.mark();
        }
    }    

    /**
     * DomShoot - Creates a DomBullet object in the GameWorld2.
     */
    public void domShoot(){
        setImage("domFiring.png");
        domShoot.setVolume(80);
        domShoot.play();
        GameWorld2 w = (GameWorld2) getWorld();
        DomBullet domBullet = new DomBullet();
        w.addObject(domBullet, getX() - 15, getY() - 12);
    }
}
