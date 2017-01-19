import greenfoot.*;

/**
 * Write a description of class SkyDude1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Enemy
{
    SimpleTimer timer = new SimpleTimer();
    public Bird(){       
        GreenfootImage image = getImage();
        double scaleFactor = 2.5;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    /**
     * Act - do whatever the SkyDude1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        enemyMove();
        if (Greenfoot.getRandomNumber(125) == 33){
            spawnEgg();
        }
        remove();
    }    

    /**
     * spawnEgg - Creates an Egg instance and adds it to the world.
     */
    public void spawnEgg(){
        GameWorld1 w = (GameWorld1) getWorld();
        Egg egg = new Egg();
        w.addObject(egg, getX() - 2, getY()+5);
    }
}
