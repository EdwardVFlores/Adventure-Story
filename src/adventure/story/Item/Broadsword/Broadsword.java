package adventure.story.Item.Broadsword;

import adventure.story.Item.Weapon;

/**
 * @author Edward Flores
 */
public abstract class Broadsword extends Weapon {
    
    /**
     * @param swordType Material
     * @param damage Damage it does
     */
    
    public Broadsword(String swordType, int damage) {
        super(swordType + " Broadsword",damage);
    }
}
