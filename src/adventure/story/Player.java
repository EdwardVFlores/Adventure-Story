package adventure.story;

import adventure.story.Item.*;
import java.util.ArrayList;

/**
 * @author Edward Flores
 */
public abstract class Player {

    private final String CLASSNAME;
    private int health, defense;
    private final ArrayList<Item> INVENTORY = new ArrayList<>();

    public Player(String className) {
        this.CLASSNAME = className;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getClassName() {
        return this.CLASSNAME;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDefense() {
        return this.defense;
    }

    public void changeHealth(int health) {
        this.health += health;
    }

    public void changeDefense(int defense) {
        this.defense += defense;
    }

    public abstract void Attack();

    public void Defend() {
        System.out.println("Blocking for " + this.defense + " damage.");
    }

    public void showInventory() {
        System.out.println("\n+-- Inventory --+");
        for (int i = 0; i < INVENTORY.size(); i++) {
            System.out.println(i + 1 + ") " + INVENTORY.get(i).getItemName());
        }
        System.out.println("+---------------+\n");

    }

    public void pickUp(Item item) {
        System.out.println(item.getItemName() + " has been added to your inventory.");
        INVENTORY.add(item);
    }

    public void removeItem(int itemNumber) {
        System.out.println("Item Removed");
    }

    public void showStats() {
        System.out.println();
        System.out.println("+-- " + this.CLASSNAME + " Stats --+");
        System.out.println(" Health: " + this.getHealth());
        System.out.println(" Defense: " + this.getDefense());
        System.out.print("+------");
        for (int i = 0; i < this.CLASSNAME.length(); i++) {
            System.out.print("-");
        }
        System.out.println("------+");
    }
}
