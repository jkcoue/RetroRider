import greenfoot.*;

public class DomBullet extends EnemyAttacks
{
    private int dir;
    public DomBullet(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.2;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        image.mirrorHorizontally();
        setImage(image); 
        dir = (Greenfoot.getRandomNumber(200-130)+130);
    }

    public void act() 
    {
        setRotation(dir);
        move(5);
        remove();
    }    
}
