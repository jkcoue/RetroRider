import greenfoot.*;

/**
 * Write a description of class TBeam2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TBeam2 extends EnemyAttacks
{
    int direction;
    
    public TBeam2(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }
        
    /**
     * Act - do whatever the TBeam2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(direction);
        move(-5);
        remove();
    }    
}
