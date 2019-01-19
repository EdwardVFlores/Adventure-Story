package adventure.story;

/**
 * @author Edward Flores
 * @date 1/18/2019
 */

public class Mage extends Player {
    private final int BASEHEALTH = 10;
    private final int BASEDEFENSE = 1;

    public Mage() {
        super("Mage");
        this.changeHealth(BASEHEALTH);
        this.changeDefense(BASEDEFENSE);
    }
    
    @Override
    public void Attack(){
        System.out.println("Mage Attack successful!");
    }
    
}
