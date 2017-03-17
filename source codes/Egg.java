import greenfoot.*;

public class Egg extends EnemyAttacks
{
    public Egg(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.2;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    public void act() 
    {
        setRotation(90);
        move(3);
        remove();
    }    
    
}
