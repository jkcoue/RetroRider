import greenfoot.*;

public class Blast extends Attacks
{   
    int direction;
    public Blast(){
        direction = 0;
    }

    public void act() 
    {
        setRotation(direction);
        move(7);
        remove();
    }    
}
