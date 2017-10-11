import greenfoot.*;

public class TBeam2 extends EnemyAttacks
{
    int direction;
    
    public TBeam2(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }
        
    public void act() 
    {
        setRotation(direction);
        move(-5);
        remove();
    }    
}
