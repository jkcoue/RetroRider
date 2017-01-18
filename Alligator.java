import greenfoot.*;
import java.util.Random;
/**
 * Write a description of class Dude1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Enemy
{
    public Alligator(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.5;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    /**
     * Act - do whatever the Dude1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        enemyMove();
        remove();
    }
}
