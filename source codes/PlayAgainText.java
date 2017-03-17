import greenfoot.*;

public class PlayAgainText extends Texts
{
    int timer = 0;
    public void act(){
        timer++;
        if (timer == 30){
            setImage("transparent.png");
        }
        if (timer == 60){
            setImage("playAgainText.png");
            timer = 0;
        }
    }    
}
