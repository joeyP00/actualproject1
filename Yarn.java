import mayflower.*;
/**
 * Write a description of class Yarn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yarn extends Actor
{
    public Yarn()
    {
        setImage("img/coins.png");

    }
    
    public void act() {
        if(isTouching(Cat.class) ) {
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            
                World w = getWorld();
                w.removeObject(this);
                c.increaseScore(1);
            
        }
    }
}
