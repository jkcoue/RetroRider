import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int speed;
    public Enemy(){
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
     * enemyMove - Moves an enemy from right to left at a random speed
     */
    public void enemyMove(){
        move(speed);
    }

    /**
     * remove - removes this object when it is touching the edge of world.
     * This method also causes the isDead variable from the Hero class to become true if this actor
     * is touching the hero.
     */
    public void remove(){
        if (isAtEdge() == true){
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Hero.class)){
            if(this.getWorld().getClass() == GameWorld1.class){
                GameWorld1 w1 = (GameWorld1) getWorld();
                w1.hero.isDead = true;
            }
            if(this.getWorld().getClass() == TmanWorld.class){  
                TmanWorld wT = (TmanWorld) getWorld();
                wT.hero.isDead = true;
            }
        }
    }
}
