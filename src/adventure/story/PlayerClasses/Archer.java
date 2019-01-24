package adventure.story.PlayerClasses;
import adventure.story.Player;

/**
 * @author Edward Flores
 */
public class Archer extends Player {

    private final int BASEHEALTH = 10;
    private final int BASEDEFENSE = 0;

    public Archer() {
        super("Archer");
        this.changeHealth(BASEHEALTH);
        this.changeDefense(BASEDEFENSE);
    }
}
