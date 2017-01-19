import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class airmanWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirmanWorld extends GameWorld
{
    Airman airman = new Airman();
    Hero hero = new Hero();
    Score score = new Score();
    BossAlert alert = new BossAlert();
    SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class airmanWorld.
     * 
     */
    public AirmanWorld()
    {
        super();
        setup();
        timer.mark();
    }

    /**
     * setup - This method adds the instances of objects that are needed when the world is initialized
     */
    private void setup(){
        addObject(hero, 90, 370);
        addObject(airman, 800, 200);
        addObject(alert, 400, 100);
        addObject(score, 60, 60);
    }

    /**
     * updateScore - Updates the player's current score and outputs it to the current world.
     */
    public void updateScore(){
        GreenfootImage image = new GreenfootImage(120, 100);
        image.setFont(new Font("8BIT WONDER Nominal", Font.PLAIN, 13));
        Color scoreColor = new Color(255, 255, 240);
        image.setColor(scoreColor);
        image.drawString("Score "+ Integer.toString(score.getScore()), 10, 15);
        score.setImage(image);
    }

    public void act(){
        super.act();
        airmanTheme2.setVolume(60);
        airmanTheme2.playLoop(); 
        if(timer.millisElapsed() > 4000){
            removeObject(alert);
        }
        updateScore();
        if(hero.isDead == true){
            airmanTheme2.stop();
            GameOver gameOver = new GameOver();
            gameOver.score.setScore(score.getScore());
            Greenfoot.delay(50);
            Greenfoot.setWorld(gameOver);
        }
        if(getObjects(Boss.class).isEmpty()){
            score.addScoreBoss();
            airmanTheme2.stop();
            GameWorld2 w2 = new GameWorld2();
            w2.score.setScore(score.getScore());
            Greenfoot.delay(100);
            Greenfoot.setWorld(w2);
        }
    }
}
