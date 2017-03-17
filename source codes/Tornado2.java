import greenfoot.*;

public class Tornado2 extends EnemyAttacks
{
    int direction;
    public Tornado2(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        direction = 0;
    }

    public void act() 
    {
        setRotation(direction);
        remove();
        move(-4);
    }    
}
