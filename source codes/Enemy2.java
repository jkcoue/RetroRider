import greenfoot.*;

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    private int speed;
    GreenfootSound domShoot = new GreenfootSound("domShoot.wav");
    public Enemy2(){
        if(Greenfoot.getRandomNumber(3) == 0){
            speed = -1;
        }
        if(Greenfoot.getRandomNumber(3) == 1){
            speed = -2;
        }
        if(Greenfoot.getRandomNumber(3) == 2){
            speed = -3;
        }
    }

    /**
     * enemy2Move - This method moves enemies from GameWorld2 from right to left at a random speed.
     */
    public void enemy2Move(){
        move(speed);
    }

    /**
     * Remove - Removes this object when it is at edge of the world.
     */
    public void remove(){
        if (isAtEdge() == true){
            getWorld().removeObject(this);
            return;
        }
    }
}
