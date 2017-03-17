import greenfoot.*;

public class Jet extends Enemy
{
    SimpleTimer timer = new SimpleTimer();
    public Jet(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.3;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        image.mirrorVertically();
        setImage(image);
    }

    public void act() 
    {
        GameWorld1 w = (GameWorld1) getWorld();
        turnTowards(w.hero.getX(), w.hero.getY());
        move(3);
        if (timer.millisElapsed() > 1500){
            shootBullet();
            timer.mark();
        }
        remove();
    }    

    /**
     * Creates a Bullet instance and adds it to the world.
     */
    private void shootBullet(){
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX() - 36, getY() + 7);
    }
}
