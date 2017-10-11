import greenfoot.*;


public class Attacks extends Actor
{
    GreenfootSound bossHit1  = new GreenfootSound("bossHit1.wav");
    GreenfootSound bossHit2  = new GreenfootSound("bossHit2.wav");
    GreenfootSound explosionSound = new GreenfootSound("deathExplode.wav");
    
    /**
     * Remove - This method removes the objects of this class when it is at the edge of the world and removes
     * this object when it touches the enemy/boss as well as adding to the player score. This method also removes 
     * the enemies that it touches and reduces the HP of the bosses that it touches.
     */
    public void remove(){
        Explosion1 e1 = new Explosion1();
        if(isTouching(Enemy.class)){
            if(this.getWorld().getClass() == GameWorld1.class){
                GameWorld1 w = (GameWorld1) getWorld();
                w.score.addScore();
                getWorld().addObject(e1, getX() + 10, getY());
                removeTouching(Enemy.class);
                getWorld().removeObject(this);
                explosionSound.setVolume(85);
                explosionSound.play();
                return;
            }
            if(this.getWorld().getClass() == GameWorld2.class){
                GameWorld2 w2 = (GameWorld2) getWorld();
                w2.score.addScore();
                getWorld().addObject(e1, getX() + 10, getY());
                removeTouching(Enemy.class);
                getWorld().removeObject(this);
                explosionSound.setVolume(85);
                explosionSound.play();
                return;
            }
            if(this.getWorld().getClass() == AirmanWorld.class){
                AirmanWorld wA = (AirmanWorld) getWorld();
                wA.score.addScore();
                getWorld().addObject(e1, getX() + 10, getY());
                removeTouching(Enemy.class);
                getWorld().removeObject(this);
                explosionSound.setVolume(85);
                explosionSound.play();
                return;
            }
            if(this.getWorld().getClass() == TmanWorld.class){
                TmanWorld wT = (TmanWorld) getWorld();
                wT.score.addScore();
                getWorld().addObject(e1, getX() + 10, getY());
                removeTouching(Enemy.class);
                getWorld().removeObject(this);
                explosionSound.setVolume(85);
                explosionSound.play();
                return;
            }
        }
        if(isTouching(Enemy2.class)){
            GameWorld2 w2 = (GameWorld2) getWorld();
            w2.score.addScore();
            getWorld().addObject(e1, getX() + 10, getY());
            removeTouching(Enemy2.class);
            getWorld().removeObject(this);
            explosionSound.setVolume(85);
            explosionSound.play();
            return;
        }
        if(isTouching(Boss.class)){
            if(this.getWorld().getClass() == TmanWorld.class){
                TmanWorld tW = (TmanWorld) getWorld();
                tW.tMan.takeDmg();
                getWorld().addObject(e1, getX() + 10, getY());
                getWorld().removeObject(this);
                bossHit1.setVolume(85);
                bossHit1.play();
                return;
            }
            if(this.getWorld().getClass() == AirmanWorld.class){
                AirmanWorld aW = (AirmanWorld) getWorld();
                aW.airman.takeDmg();
                getWorld().addObject(e1, getX() + 10, getY());
                getWorld().removeObject(this);
                bossHit2.setVolume(85);
                bossHit2.play();
                return;
            }
        }
        if (isAtEdge()== true){
            getWorld().removeObject(this);
            return;
        }
    }
}
