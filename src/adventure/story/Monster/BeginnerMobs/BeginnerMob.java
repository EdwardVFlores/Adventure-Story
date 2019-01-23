package adventure.story.Monster.BeginnerMobs;

/**
 * @author Edward Flores
 */
public abstract class BeginnerMob {

    private final String MOBNAME;
    private int health, defense, mobDamage, XP;

    public BeginnerMob(String mobName) {
        this.MOBNAME = mobName;
    }

    public void changeHealth(int health) {
        this.health += health;
    }

    public void changeDefense(int defense) {
        this.defense += defense;
    }

    public void changeMobDamage(int mobDamage) {
        this.mobDamage += mobDamage;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDefense() {
        return this.defense;
    }

    public String getMobName() {
        return this.MOBNAME;
    }

    public abstract int getXP();

    public int Attack() {
        System.out.println("+--"+MOBNAME+"--+");
        System.out.println("Health: " + this.getHealth());
        System.out.println("Defense: " + this.getDefense());
        System.out.println("\nYou took " + this.mobDamage + " damage!\n");
        return -this.mobDamage;
    }

}
