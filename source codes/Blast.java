import greenfoot.*;

/**
 * Write a description of class Blast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blast extends Attacks
{   
    int direction;
    public Blast(){
        direction = 0;
    }

    /**
     * Act - do whatever the Blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(direction);
        move(7);
        remove();
    }    
}
