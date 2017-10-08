import greenfoot.*;

public class Tank extends Enemy2
{
    SimpleTimer timer = new SimpleTimer();
    
    public Tank(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }
    
    public void act() 
    {
        enemy2Move();
        remove();
        if (timer.millisElapsed() > 2000){
            shootRocket();
            timer.mark();
        }
    }    
    
    /**
     * shootRocket - This method creates and adds an instance of Rocket to the world.
     */
    private void shootRocket(){
        Rocket rocket = new Rocket();
        getWorld().addObject(rocket, getX() - 32, getY() - 10);
    }
}
