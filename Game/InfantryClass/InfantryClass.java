package Game.InfantryClass;

import Game.BaseHero;

/**
 * пехота(общий класс)
 */

 public abstract class InfantryClass extends BaseHero {


    public InfantryClass(String name, int hp, int speed,int damage, int protection, int x, int y) {
        super(name, hp, speed, damage, protection, x, y);
      
    }    
    
}