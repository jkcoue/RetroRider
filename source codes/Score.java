import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class Score extends Actor
{
    private int playerScore;

    public Score(){
        playerScore = 0;
        GreenfootImage image = new GreenfootImage(100, 100);
        image.setFont(new Font("8BIT WONDER Nominal", Font.PLAIN, 12));
        Color scoreColor = new Color(255, 255, 240);
        image.setColor(scoreColor);
        image.drawString("Score "+ Integer.toString(0), 10, 15);
        setImage(image);
    }

    /**
     * getScore - This method returns the current score of player.
     */
    public int getScore(){
        return playerScore;
    }

    /**
     * addScore - This method adds 1 to the current score of player.
     */
    public void addScore(){
        playerScore++;
    }

    /**
     * addScoreBoss - This method adds 20 to the current score of a player.
     */
    public void addScoreBoss(){
        playerScore = playerScore + 20;
    }

    /**
     * setScore - This method changes the current score of a player to score inputted to (int current).
     */
    public void setScore(int current){
        playerScore = current;
    } 
}
