import greenfoot.*;
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class BossDefeatWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossDefeatWorld extends EndWorlds
{
    SimpleTimer timer = new SimpleTimer();
    Texts dText = new Texts();
    Score score = new Score();
    /**
     * Constructor for objects of class BossDefeatWorld.
     * 
     */
    public BossDefeatWorld()
    {
        super();
        dText.setImage("bossDefeatText.png");
        addObject(dText, 400, 100);
        addObject(score, 445, 310);
    }

    public void act(){
        super.act();
        updateScore();
        winTheme.play();
        if(timer.millisElapsed() > 16000){
            winTheme.setVolume(70);
            winTheme.stop();
            Greenfoot.delay(100);
            Greenfoot.setWorld(new Credits());
        }
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
