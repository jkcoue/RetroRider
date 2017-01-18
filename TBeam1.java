import greenfoot.*;

/**
 * Write a description of class TBeam1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TBeam1 extends EnemyAttacks
{
    int direction;
    public TBeam1(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        setImage(image);
        direction = (Greenfoot.getRandomNumber(270-90)+90);
    }
    
    /**
     * Act - do whatever the TBeam1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(direction);
        remove();
        move(5);
    }    
}
