import greenfoot.*;


public class AirmanAtk1 extends EnemyAttacks
{
    public AirmanAtk1(){
        GreenfootImage image = getImage();
        double scaleFactor = 1.8;
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
