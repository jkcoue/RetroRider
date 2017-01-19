import greenfoot.*;
/**
 * Write a description of class Airman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airman extends Boss
{
    SimpleTimer timer = new SimpleTimer();
    public Airman(){
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        setHP(30);
    }

    /**
     * Act - do whatever the Airman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //HP tracking
        if(getHP() <= 0){
            getWorld().removeObject(this);
            return;
        }
        //Attacks
        if(Greenfoot.getRandomNumber(25) == 1 && timer.millisElapsed() > 300){
            airmanAtk2();
            timer.mark();
        }
        if(Greenfoot.getRandomNumber(90) == 1 && timer.millisElapsed() > 150){
            airmanAtk1();
            timer.mark();
        }
        if(timer.millisElapsed() > 200){
            airmanOGPosition();
        }
        //Movement
        if(getX() > 720){
            tornadoForm();
            setLocation(getX()-1, getY());
        }
    }

    /**
     * Creates an AirmanAtk1 instance in the world.
     */
    public void airmanAtk1(){
        AirmanAtk1 airmanAtk1 = new AirmanAtk1();
        getWorld().addObject(airmanAtk1, getX()-9, getY() - 18);
    }

    /**
     * Resizes and creates an AirmanAtk2 instance in the world.
     */
    public void airmanAtk2(){
        setImage("airmanFiring.png");
        //resize image
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
        //spawn attack
        AirmanAtk2 airmanAtk2 = new AirmanAtk2();
        getWorld().addObject(airmanAtk2, getX() -50, getY() - 22);
    }

    /**
     * airmanOGPosition - resets the image of the object to airman1.png.
     */
    private void airmanOGPosition(){
        setImage("airman1.png");
        GreenfootImage image = getImage();
        double scaleFactor = 2.8;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    /**
     * tornadoForm - sets the image of object to airmanTornadoForm.png.
     */
    private void tornadoForm(){
        tornadoSound.setVolume(95);
        tornadoSound.play();
        setImage("airmanTornadoForm.png");
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }
}
