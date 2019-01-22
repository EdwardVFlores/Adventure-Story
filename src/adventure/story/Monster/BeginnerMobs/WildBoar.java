package adventure.story.Monster.BeginnerMobs;

/**
 * @author Edward Flores
 */
public class WildBoar extends BeginnerMob {

    private final int DAMAGE = 2;
    private final int HEALTH = 2;
    private final int DEFENSE = 1;
    private final int XP = 1;

    public WildBoar() {
        super("Wild Boar");
        super.changeHealth(HEALTH);
        super.changeMobDamage(DAMAGE);
        super.changeDefense(DEFENSE);
    }

    @Override
    public int getXP() {
        return this.XP;
    }
}
