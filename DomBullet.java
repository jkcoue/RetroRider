import greenfoot.*;

/**
 * Write a description of class DomBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DomBullet extends EnemyAttacks
{
    private int dir;
    public DomBullet(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.2;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        setImage(image); 
        dir = (Greenfoot.getRandomNumber(200-130)+130);
    }

    /**
     * Act - do whatever the DomBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(dir);
        move(5);
        remove();
    }    
}
