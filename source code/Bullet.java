import greenfoot.*;

public class Bullet extends EnemyAttacks
{
    public void act() 
    {
        move(-5);
        remove();
    }    
}
