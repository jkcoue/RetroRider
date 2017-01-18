import greenfoot.*;

/**
 * Write a description of class IntroScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroScreen extends GameWorld
{
    private int randomSong = Greenfoot.getRandomNumber(2);
    Texts title = new Texts();
    
    /**
     * Constructor for objects of class Sky.
     * 
     */
    public IntroScreen(){  
        super();
        setup();
    }   

    public void act(){
        super.act();
        if (randomSong == 0){
            introTheme.playLoop();
        }
        if (randomSong == 1){
            introTheme2.playLoop();
        }
        if (Greenfoot.isKeyDown("enter")){
            introTheme.stop();
            introTheme2.stop();
            Greenfoot.delay(50);
            Greenfoot.setWorld(new PreGameWorld());
        }
    }

    /**
     * setup - This method adds the instances of objects that are needed when the world is initialized
     */
    public void setup(){
        Hero hero = new Hero();
        addObject(hero, 400, 345);
        StartButton start = new StartButton();
        addObject(start, 400, 140);
        title.setImage("introTitle.png");
        addObject(title, 400, 80);
    }
}
