import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
/**
 * GameWorld Class for Game
 * 
 * @author Justin Oue
 * @version May 2015
 */
public class GameWorld1 extends GameWorld
{
    SimpleTimer timer = new SimpleTimer();
    SimpleTimer timer2 = new SimpleTimer();
    Hero hero = new Hero();
    Score score = new Score();
    Texts level1 = new Texts();

    /**
     * Constructor for objects of class Sky.
     * 
     */
    public GameWorld1(){    
        super();
        setup();
    }

    /**
     * setup - This method adds the instances of objects that are needed when the world is initialized
     */
    private void setup(){
        addObject(score, 60, 60);
        addObject(hero, 90, 370);
        level1.setImage("level1Text.png");
        addObject(level1, 400, 100);
        timer.mark();
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
        stage1Theme.playLoop(); 
        if(timer.millisElapsed() > 3000){
            removeObject(level1);
        }
        if (Greenfoot.getRandomNumber(110) == 75){
            spawnAlligator();
        }
        if (Greenfoot.getRandomNumber(110) == 75){
            spawnBird();
        }
        if (timer.millisElapsed() > 3200){
            spawnJet();
            timer.mark();
        }
        if(hero.isDead == true){
            stage1Theme.stop();
            GameOver gameOver = new GameOver();
            gameOver.score.setScore(score.getScore());
            Greenfoot.delay(30);
            Greenfoot.setWorld(gameOver);
        }
        if (timer2.millisElapsed() > 50000){
            stage1Theme.stop();
            AirmanWorld aWorld = new AirmanWorld();
            aWorld.score.setScore(score.getScore());
            Greenfoot.delay(100);
            Greenfoot.setWorld(aWorld);
            timer2.mark();
        }
    }
}