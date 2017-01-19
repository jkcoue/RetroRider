import greenfoot.*;

/**
 * Write a description of class BigTornado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigTornado extends EnemyAttacks
{
    GreenfootSound hardExplosionSound = new GreenfootSound("hardExplosion.wav");
    public BigTornado(){
        GreenfootImage image = getImage();
        double scaleFactor = 3.0;
        int x = (int) (image.getWidth() * scaleFactor);
        int y = (int) (image.getHeight() * scaleFactor);
        image.scale(x, y);
        setImage(image);
    }

    /**
     * Act - do whatever the BigTornado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        remove(); 
        if(getX() < 400){
            tornadoExplode();
        }    
    }

    /**
     * tornadoExplode - removes the BigTornado object and adds an array of Tornado2 instances to the world.
     */
    public void tornadoExplode(){
        Tornado2[] t2 = new Tornado2[10];
        hardExplosionSound.play();
        for (int i = 0; i < 10; i++){
            t2[i] = new Tornado2();
            t2[i].direction = (36*i);
            getWorld().addObject(t2[i], getX(), getY());
        }
        getWorld().removeObject(this);
    }
}
