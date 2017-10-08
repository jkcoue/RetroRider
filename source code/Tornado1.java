import greenfoot.*;

public class Tornado1 extends EnemyAttacks
{
    public Tornado1(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }
    
    public void act() 
    {
        move(-5);
        remove(); 
    }
}
