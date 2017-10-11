import greenfoot.*;

public class CreditTexts extends Texts
{
  
    public void act() 
    {
        move(-1);
        if (this.isAtEdge() == true){
            getWorld().removeObject(this);
        }
    }    
}
