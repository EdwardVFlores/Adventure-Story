package adventure.story.Item;

/**
 * @author Edward Flores
 */
public class Item {

    private String itemType,itemName;
    private int damage;

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String ItemType) {
        this.itemType = ItemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String ItemName) {
        this.itemName = ItemName;
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }

}
