import greenfoot.*;

/**
 * Write a description of class airmanAtk1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirmanAtk1 extends EnemyAttacks
{
    public AirmanAtk1(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.8;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    /**
     * Act - do whatever the airmanAtk1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-5);
        remove();
    }    
}
