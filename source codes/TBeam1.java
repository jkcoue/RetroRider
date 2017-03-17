import greenfoot.*;

public class TBeam1 extends EnemyAttacks
{
    int direction;
    public TBeam1(){
        GreenfootImage image = getImage();
        double scaleFactor = 2.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        setImage(image);
        direction = (Greenfoot.getRandomNumber(270-90)+90);
    }
    
    public void act() 
    {
        setRotation(direction);
        remove();
        move(5);
    }    
}
