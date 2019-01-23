package adventure.story.Item;

/**
 * @author Edward Flores
 */
public class Weapon extends Item {

    public Weapon(String weaponName,int damage) {
        super.setItemType("Weapon");
        super.setItemName(weaponName);
        super.setDamage(damage);
    }

}
