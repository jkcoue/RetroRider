import greenfoot.*;

public class Rocket extends EnemyAttacks
{
    public Rocket(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.2;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        setImage(image);
    }

    public void act() 
    {
        move(-5);
        remove();
    }    
}

