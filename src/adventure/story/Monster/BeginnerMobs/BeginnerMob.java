package adventure.story.Monster.BeginnerMobs;
/**
 * @author Edward Flores
 */
public abstract class BeginnerMob{
    private final String MOBNAME;
    private int health,defense,mobDamage;
    
    /**
     * @param mobName Mob Name
     * @param mobDamage Mob Damage
     * @param health Mob Health
     * @param defense Mob Defense
     */
    public BeginnerMob(String mobName, int mobDamage, int health, int defense){
        this.MOBNAME = mobName;
        this.mobDamage = mobDamage;
        this.health = health;
        this.defense = defense;
    }
    
    public void changeHealth(int health){
        this.health += health;
    }
    
    public void changeDefense(int defense){
        this.defense += defense;
    }
    
    public void changeMobDamage(int mobDamage){
        this.mobDamage += mobDamage;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    public int getDefense(){
        return this.defense;
    }
    
    public String getMobName(){
        return this.MOBNAME;
    }
    public int Attack(){
        System.out.println("Health: "+this.getHealth());
        System.out.println("Defense: "+this.getDefense());
        System.out.println("You took "+this.mobDamage+" damage!");
        return -this.mobDamage;
    }
}
