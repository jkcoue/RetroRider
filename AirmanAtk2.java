import greenfoot.*;

/**
 * Write a description of class airmanAtk2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirmanAtk2 extends EnemyAttacks
{
    int direction1 = 0;
    int direction2 = 0;
    public AirmanAtk2(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        direction1 = (Greenfoot.getRandomNumber(90));
        direction2 = (Greenfoot.getRandomNumber(360-270)+270);
    }

    /**
     * Act - do whatever the airmanAtk2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.getRandomNumber(2) == 0){
            setRotation(direction1); 
        }
        if (Greenfoot.getRandomNumber(2) == 1){
            setRotation(direction2); 
        }
        move(-7);
        remove();
    }    
}
