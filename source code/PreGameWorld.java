import greenfoot.*;

public class PreGameWorld extends GameWorld
{
    Hero hero = new Hero();
    Texts control = new Texts();
    Texts command = new Texts();
    /**
     * Constructor for objects of class PreGameWorld.
     * 
     */
    public PreGameWorld()
    {
        super();
        setup();
    }

    public void setup(){
        addObject(hero, 400, 345);
        control.setImage("ControlText.png");
        addObject(control, 400, 98);
        command.setImage("commandText.png");
        addObject(command, 175, 360);
    }

    public void act(){
        super.act();
        waitTheme.setVolume(60);
        waitTheme.playLoop();
        if(hero.getX() > 785){
            waitTheme.stop();
            Greenfoot.delay(50);
            Greenfoot.setWorld(new GameWorld1());
        }
    }
}
