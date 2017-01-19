import greenfoot.*;

/**
 * Write a description of class EndWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndWorlds extends World
{
    private static String bgImageName = "bg2.png";
    private static final double scrollSpeed = 2.5;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    GreenfootSound creditTheme = new GreenfootSound("gsTheme.mp3");
    GreenfootSound creditTheme2 = new GreenfootSound("driverHigh8bitTrim.mp3");
    GreenfootSound winTheme = new GreenfootSound("winTheme.mp3");
    
    /**
     * Constructor for objects of class EndWorld.
     * 
     */
    public EndWorlds()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
    }

    public void act(){
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
    }

    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
}
