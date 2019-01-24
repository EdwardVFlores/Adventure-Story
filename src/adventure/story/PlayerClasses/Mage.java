package adventure.story.PlayerClasses;
import adventure.story.Player;

/**
 * @author Edward Flores
 */
public class Mage extends Player {

    private final int BASEHEALTH = 10;
    private final int BASEDEFENSE = 0;

    public Mage() {
        super("Mage");
        this.changeHealth(BASEHEALTH);
        this.changeDefense(BASEDEFENSE);
    }
}
