import greenfoot.*;
import java.util.Random;

public class Alligator extends Enemy
{
    public Alligator(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.5;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }


    public void act() 
    {
        enemyMove();
        remove();
    }
}
