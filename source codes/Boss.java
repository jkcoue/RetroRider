import greenfoot.*;

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private int HP = 0;
    GreenfootSound tornadoSound  = new GreenfootSound("Tornado.wav");
    GreenfootSound explosionSound = new GreenfootSound("deathExplode.wav");
    GreenfootSound charge = new GreenfootSound("charge1.wav");
    GreenfootSound beamSound = new GreenfootSound("shootlaser1.wav");
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   

    /**
     * takeDmg - reduce the HP by one.
     */
    public void takeDmg(){
        if(isTouching(Blast.class)){
            HP--;   
        }
    }

    /**
     * getHP - returns the current HP of the boss.
     */
    public int getHP(){
        return HP;
    }

    /**
     * setHP - Set the boss HP to the int variable "current".
     */
    public void setHP(int current){
        HP = current;
    }
}
