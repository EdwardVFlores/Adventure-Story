package adventure.story.Monster.BeginnerMobs;

/**
 * @author Edward Flores
 */
public class DyreWolf extends BeginnerMob {

    private final int DAMAGE = 3;
    private final int DEFENSE = 0;
    private final int HEALTH = 5;
    private final int XP = 1;

    public DyreWolf() {
        super("Dyre Wolf");
        super.changeHealth(HEALTH);
        super.changeMobDamage(DAMAGE);
        super.changeDefense(DEFENSE);
    }

    @Override
    public int getXP() {
        return this.XP;
    }
}
