import greenfoot.*;

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
    
    public void act() 
    {
        remove();
        if(timer.millisElapsed() > 200){
            getWorld().removeObject(this);
        }
    }    
}
