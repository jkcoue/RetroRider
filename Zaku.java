import greenfoot.*;

/**
 * Write a description of class Zaku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zaku extends Enemy2
{
    public Zaku(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.2;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        image.mirrorVertically();
        setImage(image);
    }

    /**
     * Act - do whatever the Zaku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GameWorld2 w2 = (GameWorld2) getWorld();
        turnTowards(w2.hero.getX(), w2.hero.getY());
        move(Greenfoot.getRandomNumber(5-3)+3);
        remove();
    }    
}
