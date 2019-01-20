package adventure.story;

/**
 * @author Edward Flores
 */

public abstract class Player{
    private final String CLASSNAME;
    private int health,defense;
    
    public Player(String className){
        this.CLASSNAME = className;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void setDefense(int defense){
        this.defense = defense;
    }
    
    public String getClassName(){
        return this.CLASSNAME;
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
        System.out.println("+-- "+this.CLASSNAME+" Stats --+");
        System.out.println(" Health: " + this.getHealth());
        System.out.println(" Defense: " + this.getDefense());
        System.out.print("+------");
        for (int i=0; i<this.CLASSNAME.length(); i++) {
            System.out.print("-");
        }
        System.out.println("------+");
    }
}
