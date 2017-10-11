import greenfoot.*;

public class Cloud extends EnemyAttacks
{
    SimpleTimer timer = new SimpleTimer();
    public Cloud(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.5;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    public void act() 
    {
        move(-1);
        if(timer.millisElapsed() > 2000 && getX() > 100){
            spawnLightning();
            timer.mark();
        }
        remove();
    }    

    /**
     * spawnLightning - Creates and add an instance of CloudLightning to the world.
     */
    public void spawnLightning(){
        TmanWorld wT = (TmanWorld) getWorld();
        CloudLightning light = new CloudLightning();
        wT.addObject(light, getX() - 5, getY() + 90);
    }
}
