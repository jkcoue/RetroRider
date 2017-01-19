import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private static String bgImageName = "bg1.png";
    private static final double scrollSpeed = 2.5;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    Score score = new Score();
    GreenfootSound introTheme = new GreenfootSound("introTheme.mp3");
    GreenfootSound introTheme2 = new GreenfootSound("introTheme2.mp3");
    GreenfootSound stage1Theme = new GreenfootSound("stage1Theme.mp3");
    GreenfootSound stage2Theme = new GreenfootSound("firemanTheme.mp3");
    GreenfootSound airmanTheme = new GreenfootSound ("airmanTheme.mp3");
    GreenfootSound airmanTheme2 = new GreenfootSound ("AirmanTheme2.mp3");
    GreenfootSound bossTheme2 = new GreenfootSound("bossTheme2.mp3");
    GreenfootSound waitTheme = new GreenfootSound("8bitDarude.mp3");
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        super(800, 400, 1); 
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
    }

    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }

    public void act(){
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
        updateScore();
    }

    public void updateScore(){
        GreenfootImage image = new GreenfootImage(70, 30);
        Color scoreColor = new Color(255, 255, 240);
        image.setColor(scoreColor);
        image.drawString("Score: "+ Integer.toString(score.getScore()), 12, 12);
        double scaleFactor = 1.6;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        score.setImage(image);
    }

    public void spawnAlligator(){
        Alligator alligator = new Alligator();
        addObject(alligator, 800, Greenfoot.getRandomNumber(370 - 305)+305);
    }

    public void spawnBird(){
        Bird bird = new Bird();
        addObject(bird, 800, Greenfoot.getRandomNumber(150));
    }

    public void spawnJet(){
        Jet jet = new Jet();
        addObject(jet, 800, Greenfoot.getRandomNumber(150));
    }

    public void spawnTank(){
        Tank tank = new Tank();
        addObject(tank, 800, Greenfoot.getRandomNumber(370 - 305)+305);
    }

    public void spawnZaku(){
        Zaku zaku = new Zaku();
        addObject(zaku, 800, Greenfoot.getRandomNumber(200));
    }

    public void spawnDom(){
        Dom dom = new Dom();
        addObject(dom, 800, Greenfoot.getRandomNumber(200));
    }
}