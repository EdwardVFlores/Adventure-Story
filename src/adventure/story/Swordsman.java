package adventure.story;

/**
 * @author Edward Flores
 */
public class Swordsman extends Player {

    private final int BASEHEALTH = 10;
    private final int BASEDEFENSE = 0;

    public Swordsman() {
        super("Swordsman");
        this.changeHealth(BASEHEALTH);
        this.changeDefense(BASEDEFENSE);
    }
}
