import greenfoot.*;

public class Hero extends Actor
{
    boolean isDead = false;
    SimpleTimer timer = new SimpleTimer();
    SimpleTimer timer2 = new SimpleTimer();
    GreenfootSound shootBlast = new GreenfootSound("shooting1.wav");
    GreenfootSound shootBarrage = new GreenfootSound("shootlaser1.wav");

    public Hero(){

    }

    public void act() 
    {
        //Controls
        if (Greenfoot.isKeyDown("right")){
            move(4);
        }
        if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("shift")){
            move(2);
        }
        if (Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("shift")){
            move(-2);
        }
        if (Greenfoot.isKeyDown("up") && getY() > 300){
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down") && getY() >= 300){
            setLocation(getX(), getY() + 4);
        }
        if(Greenfoot.isKeyDown("space")){
            setImage("heroBikeJump1.png");
            setLocation(getX(), getY() - 5);
        }
        if (!Greenfoot.isKeyDown("space") && getY() < 300){
            setLocation(getX(), getY() + 5);
        }
        
        //Shooting blast
        if (timer.millisElapsed() > 400 && Greenfoot.isKeyDown("e")){
            shootBlast();
            shootBlast.setVolume(80);
            shootBlast.play();
            timer.mark();
        }
        //Shooting barrage
        if (timer.millisElapsed() > 800 && Greenfoot.isKeyDown("r")){
            shootBarrage();
            shootBlast.setVolume(80);
            shootBlast.play();
            timer.mark();
        }
        //reset position
        if (timer.millisElapsed() > 100 && !Greenfoot.isKeyDown("Space")){
            returnOGPosition();
        }
 
        if(isTouching(EnemyAttacks.class) || isTouching(Enemy.class) || isTouching(Enemy2.class) || isTouching(Boss.class)){
            isDead = true;
        }
        //Animation
        if(!(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("e") || Greenfoot.isKeyDown("r"))){
            if(timer2.millisElapsed() > 50){
                setImage("heroBike1.png");
            }
            if(timer2.millisElapsed() > 100){
                setImage("heroBike2.png");
            }
            if(timer2.millisElapsed() > 150){
                setImage("heroBike3.png");
                timer2.mark();
            }
        }
    }

    /**
     * ShootBlast - Creates a blast instances in the world the hero is in.
     * 
     */
    private void shootBlast(){
        setImage("heroBarrage.png");
        Blast blast = new Blast();
        getWorld().addObject(blast, getX() + 40, getY() + 11);
    }

    /**
     * ShootBarrage - Creates an array of blast instances in the world the hero is in.
     */
    private void shootBarrage(){
        setImage("heroBarrage.png");
        Blast[] blasts = new Blast[3];
        for (int i = 0; i < 3; i++){
            blasts[i] = new Blast();
        }
        blasts[0].direction = 10;
        blasts[1].direction = 0;
        blasts[2].direction = 350;
        for (int i = 0; i < 3; i++){
            getWorld().addObject(blasts[i], getX() + 36, getY() + 11);
        }
    }

    /**
     * ReturnOGPosition - Returns the hero into the original position.
     */
    private void returnOGPosition(){
        setImage("heroBike1.png");
    }
}
