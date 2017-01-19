import greenfoot.*;

/**
 * Write a description of class cloudLightning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloudLightning extends EnemyAttacks
{
    SimpleTimer timer = new SimpleTimer();
    public CloudLightning(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.5;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }
    
    /**
     * Act - do whatever the cloudLightning wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        remove();
        if(timer.millisElapsed() > 200){
            getWorld().removeObject(this);
        }
    }    
}
