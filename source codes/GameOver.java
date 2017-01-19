import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private int page = 0;
    Score score = new Score();
    Texts ogre = new Texts();
    PlayAgainText again = new PlayAgainText();
    ReturnText rT = new ReturnText();
    GreenfootSound gameOver = new GreenfootSound("GameOverTheme.mp3");
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(800, 400, 1); 
        setup();
    }

    private void setup(){
        addObject(score, 435, 350);
        ogre.setImage("gameOverText.png");
        addObject(ogre, 400, 100);
        addObject(again, 400, 170);
        addObject(rT, 400, 220);
    }
    
    public void act(){
        gameOver.playLoop();
        if (Greenfoot.isKeyDown("b")){
            gameOver.stop();
            Greenfoot.delay(50);
            Greenfoot.setWorld(new IntroScreen());
        }
        if (Greenfoot.isKeyDown("enter")){
            gameOver.stop();
            Greenfoot.delay(50);
            Greenfoot.setWorld(new GameWorld1());
        }
        updateScore();
    }

    /**
     * updateScore - Updates the player's current score and outputs it to the current world.
     */
    public void updateScore(){
        GreenfootImage image = new GreenfootImage(250, 120);
        image.setFont(new Font("8BIT WONDER Nominal", Font.PLAIN, 20));
        Color scoreColor = new Color(255, 255, 240);
        image.setColor(scoreColor);
        image.drawString("Score "+ Integer.toString(score.getScore()), 20, 20);
        score.setImage(image);
    }
}

