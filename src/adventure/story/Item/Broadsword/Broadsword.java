package adventure.story.Item.Broadsword;
import adventure.story.Item.Weapon;
/**
 * @author Edward Flores
 */
public abstract class Broadsword extends Weapon{
    private final String swordName;
    private int damage;
    /**
     * @param swordType Material
     * @param damage Damage it does
     */
    public Broadsword(String swordType, int damage){
        super(swordType+" Broadsword");
        this.swordName = swordType+ " Broadsword";
        this.damage = damage;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public String getSwordName(){
        return this.swordName;
    }
    
    public void setDamage(int damage) {
        this.damage = damage;
    }

}

