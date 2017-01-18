import greenfoot.*;

/**
 * Write a description of class TornadoMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TornadoMan extends Boss
{
    SimpleTimer timer = new SimpleTimer();
    SimpleTimer timer2 = new SimpleTimer();
    public TornadoMan(){
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        setHP(45);
    }

    /**
     * Act - do whatever the TornadoMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getHP() <= 0){
            getWorld().removeObject(this);
            return;
        }
        if(timer.millisElapsed() > 300){
            tManOGPosition();
        }
        if(Greenfoot.getRandomNumber(95) == 5 && timer.millisElapsed() > 150){
            shootBeam1();
            timer.mark();
        }
        if(Greenfoot.getRandomNumber(150) == 5 && timer.millisElapsed() > 150){
            shootBeam2();
        }
        if(Greenfoot.getRandomNumber(250) == 5 && timer.millisElapsed() > 800 ){
            beam2Barrage();
            timer.mark();
        }
        if(Greenfoot.getRandomNumber(380) == 5 && timer.millisElapsed() > 300 ){
            summonCloud();
            timer.mark();
        }
        if(Greenfoot.getRandomNumber(200) == 5 && timer.millisElapsed() > 400){
            groundTornado();
            timer.mark();
        }
        if(Greenfoot.getRandomNumber(280) == 5 && timer.millisElapsed() > 800){
            tornadoAtk();
            timer.mark();
        }
        if(getY() < 200){
            setLocation(getX(), getY()+1);
        }
        if(getX() > 720){
            move(-1);
        }
    }

    private void shootBeam1(){
        beamSound.setVolume(90);
        beamSound.play();
        setImage("tManShootBeam.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        TBeam1 beam1 = new TBeam1();
        getWorld().addObject(beam1, getX() - 75, getY() - 15);
    }

    private void shootBeam2(){
        beamSound.setVolume(90);
        beamSound.play();
        setImage("tManShootBeam.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        TBeam2 beam2 = new TBeam2();
        getWorld().addObject(beam2, getX() - 75, getY() - 15);
    }

    private void summonCloud(){
        setImage("tManSummon.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        Cloud cloud = new Cloud();
        getWorld().addObject(cloud, getX(), Greenfoot.getRandomNumber(170));
    }

    private void groundTornado(){
        setImage("tManSummon.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        Tornado1 tornado1 = new Tornado1();
        getWorld().addObject(tornado1, 700, (Greenfoot.getRandomNumber(100)+300));
        tornadoSound.setVolume(85);
        tornadoSound.play();
    }

    private void tornadoAtk(){
        setImage("tManShootTornado.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        BigTornado bT = new BigTornado();
        getWorld().addObject(bT, getX() - 60, getY() - 10);
        tornadoSound.setVolume(85);
        tornadoSound.play();
    }

    private void tManOGPosition(){
        setImage("tornadoMan1.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    /**
     * beam2Barrage - adds an array of TBeam2 instances in the world.
     */
    private void beam2Barrage(){
        charge.setVolume(85);
        charge.play();
        setImage("tManShootBeam.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        TBeam2[] beams2 = new TBeam2[5];
        for (int i = 0; i < 5; i++){
            beams2[i] = new TBeam2();
        }
        beams2[0].direction = 15;
        beams2[1].direction = 0;
        beams2[2].direction = 345;
        beams2[3].direction = 330;
        beams2[4].direction = 30;
        for (int i = 0; i < 5; i++){
            getWorld().addObject(beams2[i], getX() - 75, getY() - 15);
        }
    }
}
