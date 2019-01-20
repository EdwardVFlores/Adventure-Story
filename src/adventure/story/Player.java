package adventure.story;

/**
 * @author Edward Flores
 * @date 1/18/2019
 */
public abstract class Player{
    private final String className;
    private int health,defense;
    
    public Player(String className){
        this.className = className;
    }
    public String getClassName(){
        return this.className;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    public int getDefense(){
        return this.defense;
    }
    
    public void changeHealth(int health){
        this.health += health;
    }
    
    public void changeDefense(int defense){
        this.defense += defense;
    }
    
    public abstract void Attack();
    
    public void Defend(){
        System.out.println("Blocking for " + this.defense + " damage.");
    }
    public void showStats(){
        System.out.println();
        System.out.println("Showing " + this.className.toLowerCase() + " stats.");
        System.out.println("Health: " + this.getHealth());
        System.out.println("Defense: " + this.getDefense());
        System.out.println();
    } 
    
}
