import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class TmanWorld extends GameWorld
{
    SimpleTimer timer = new SimpleTimer();
    Score score = new Score();
    TornadoMan tMan = new TornadoMan();
    Hero hero = new Hero();
    BossAlert alert = new BossAlert();
    Cloud[] clouds = new Cloud[6];
    /**
     * Constructor for objects of class TmanWorld.
     * 
     */
    public TmanWorld()
    {
        super();
        setup();
        timer.mark();
    }

    public void act(){
        bossTheme2.setVolume(60);
        bossTheme2.playLoop();
        super.act();
        if(timer.millisElapsed() > 4000){
            removeObject(alert);
        }
        updateScore();
        if(hero.isDead == true){
            bossTheme2.stop();
            GameOver gameOver = new GameOver();
            gameOver.score.setScore(score.getScore());
            Greenfoot.delay(50);
            Greenfoot.setWorld(gameOver);
        }
        if(getObjects(Boss.class).isEmpty()){
            score.addScoreBoss();
            bossTheme2.stop();
            BossDefeatWorld win = new BossDefeatWorld();
            win.score.setScore(score.getScore());
            Greenfoot.delay(50);
            Greenfoot.setWorld(win);
        }
    }

    /**
     * setup - This method adds the instances of objects that are needed when the world is initialized
     */
    public void setup(){
        addObject(hero, 90, 370);
        addObject(tMan, 800, 0);
        addObject(score, 60, 60);
        addObject(alert, 400, 100);
        for (int i = 0; i < 6; i++){
            clouds[i] = new Cloud();
            addObject(clouds[i], i*150, 100);
        }
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
}
