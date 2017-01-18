import greenfoot.*;

/**
 * Credit World
 * 
 * Justin Oue 
 * @version (a version number or a date)
 */
public class Credits extends EndWorlds
{
    CreditTexts[] credits = new CreditTexts[11];
    Texts credit = new Texts();
    HeroClone hClone = new HeroClone();
    int songNum = Greenfoot.getRandomNumber(3);
    Texts thanks = new Texts();
    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits(){
        super();
        setup();
    }
    
    public void setup(){
        credit.setImage("creditsTitle.png");
        addObject(credit, 400, 50);
        addObject(hClone, 50, 350);
    }

    /**
     * prepare - this method creates an array of CreditTexts instances and 
     * gives each created instances a set image.
     */
    private void prepare(){
        for (int i = 0; i < 11; i++){
            credits[i] = new CreditTexts();
        }
        credits[0].setImage("credits1.png");
        credits[1].setImage("credits2.png");
        credits[2].setImage("credits3.png");
        credits[3].setImage("credits4.png");
        credits[4].setImage("credits5.png");
        credits[5].setImage("credits6.png");
        credits[6].setImage("credits7.png");
        credits[7].setImage("credits8.png");
        credits[8].setImage("credits9.png");
        credits[9].setImage("credits10.png");
        credits[10].setImage("credits11.png");
    } 
    int timer = 0;
    public void act(){
        super.act();
        prepare();
        if(songNum == 0){ 
            creditTheme.playLoop();
        }
        if(songNum == 1 || songNum == 2){
            creditTheme2.playLoop();
        }
        timer++;
        if (timer == 100){
            addObject(credits[0], 800, 135);
        }
        if (timer == 900){
            addObject(credits[1], 800, 135);
        }
        if (timer == 1700){
            addObject(credits[2], 800, 135);
        }
        if (timer == 2500){
            addObject(credits[3], 800, 135);
        }
        if (timer == 3300){
            addObject(credits[4], 800, 135);
        }
        if (timer == 4100){
            addObject(credits[5], 800, 135);
        }
        if (timer == 4900){
            addObject(credits[6], 800, 135);
        }
        if (timer == 5700){
            addObject(credits[7], 800, 135);
        }
        if (timer == 6500){
            addObject(credits[8], 800, 135);
        }
        if (timer == 7300){
            addObject(credits[9], 800, 135);
        }
        if (timer == 8100){
            addObject(credits[10], 800, 135);
        }
        if (timer == 8950){
            removeObject(credit);
        }
        if (timer == 9000){
            thanks.setImage("thankYou.png");
            addObject(thanks, 400, 130);
        }
        if (timer == 10500) {
            creditTheme.stop();
            creditTheme2.stop();
            Greenfoot.delay(100);
            Greenfoot.setWorld(new IntroScreen());
        }
    }
}
