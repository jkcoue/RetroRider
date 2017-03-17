import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class GameWorld2 extends GameWorld
{
    Score score = new Score();
    Hero hero = new Hero();
    Texts level2 = new Texts();
    SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class GameWorld2.
     * 
     */
    public GameWorld2()
    {
        super();
        setup();
    }

    public void act(){
        super.act();
        stage2Theme.setVolume(45);
        stage2Theme.playLoop();
        if(timer.millisElapsed() > 3000){
            removeObject(level2);
        }
        if(Greenfoot.getRandomNumber(130) == 76){
            spawnZaku();
        }
        if(Greenfoot.getRandomNumber(120) == 76){
            spawnDom();
        }
        if (Greenfoot.getRandomNumber(150) == 76){
            spawnTank();
        }
        updateScore();
        if(hero.isDead == true){
            stage2Theme.stop();
            GameOver gameOver = new GameOver();
            gameOver.score.setScore(score.getScore());
            Greenfoot.delay(30);
            Greenfoot.setWorld(gameOver);
        }
        if (timer.millisElapsed() > 45000){
            stage2Theme.stop();
            TmanWorld tWorld = new TmanWorld();
            tWorld.score.setScore(score.getScore());
            Greenfoot.delay(30);
            Greenfoot.setWorld(tWorld);
            timer.mark();
        }
    }

    /**
     * setup - This method adds the instances of objects that are needed when the world is initialized
     */
    private void setup(){
        addObject(hero, 90, 370);
        addObject(score, 60, 60);
        level2.setImage("level2Text.png");
        addObject(level2, 400, 100);
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
