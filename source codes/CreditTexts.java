import greenfoot.*;

/**
 * Write a description of class CreditTexts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditTexts extends Texts
{
    /**
     * Act - do whatever the CreditTexts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        if (this.isAtEdge() == true){
            getWorld().removeObject(this);
        }
    }    
}
