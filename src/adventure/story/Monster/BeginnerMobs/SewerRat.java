package adventure.story.Monster.BeginnerMobs;

/**
 * @author Edward Flores
 */
public class SewerRat extends BeginnerMob {

    private final int DAMAGE = 1;
    private final int HEALTH = 3;
    private final int DEFENSE = 0;
    private final int XP = 1;

    public SewerRat() {
        super("Sewer Rat");
        super.changeHealth(HEALTH);
        super.changeMobDamage(DAMAGE);
        super.changeDefense(DEFENSE);
    }

    @Override
    public int getXP() {
        return this.XP;
    }
}
