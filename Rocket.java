import greenfoot.*;

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends EnemyAttacks
{
    public Rocket(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.2;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        setImage(image);
    }

    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-5);
        remove();
    }    
}

