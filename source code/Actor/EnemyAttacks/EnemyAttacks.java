import greenfoot.*;

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
