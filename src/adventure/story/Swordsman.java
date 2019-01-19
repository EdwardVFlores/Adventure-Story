package adventure.story;

/**
 * @author Edward Flores
 * @date 1/18/2019
 */

public class Swordsman extends Player{
    private final int BASEHEALTH = 10;
    private final int BASEDEFENSE = 2;

    public Swordsman() {
        super("Swordsman");
        this.changeHealth(BASEHEALTH);
        this.changeDefense(BASEDEFENSE);
    }
    @Override
    public void Attack(){
        System.out.println("Sword Attack successful!");
    }
}
