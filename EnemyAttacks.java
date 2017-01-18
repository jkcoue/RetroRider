import greenfoot.*;

/**
 * Write a description of class EnemyAttacks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyAttacks extends Actor
{
    /**
     * Remove - Removes this object when it is at edge of the world.
     */
    public void remove(){
        if (isAtEdge()== true){
            getWorld().removeObject(this);
            return;
        }
    }
}
