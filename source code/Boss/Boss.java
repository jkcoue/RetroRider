import greenfoot.*;

public class Boss extends Actor
{
    private int HP = 0;
    GreenfootSound tornadoSound  = new GreenfootSound("Tornado.wav");
    GreenfootSound explosionSound = new GreenfootSound("deathExplode.wav");
    GreenfootSound charge = new GreenfootSound("charge1.wav");
    GreenfootSound beamSound = new GreenfootSound("shootlaser1.wav");
 
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
