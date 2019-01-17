package adventure.story;

/**
 * @author Edward Flores
 * @date 1/16/2019
 */

import java.util.Scanner;

public class AdventureStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to adventure story where you fight monsters!");
        System.out.println("Choose your class:");
        System.out.println("1) Swordsman");
        System.out.println("2) Archer");
        System.out.println("3) Mage");
        System.out.print("Select by number ");
        Player player = new Player();
        int classNum = input.nextInt();
        boolean gotClass = false;
        while(gotClass == false){
            switch(classNum){
                case 1:
                    player = new Swordsman();
                    gotClass = true;
                    break;
                case 2:
                    player = new Archer();
                    gotClass = true;
                    break;
                case 3:
                    player = new Mage();
                    gotClass = true;
                    break;
                default:
                    System.out.println("Choose your class:");
                    System.out.println("1) Swordsman");
                    System.out.println("2) Archer");
                    System.out.println("3) Mage");
                    System.out.print("Select by number ");
                    classNum = input.nextInt();
            }
        }
        System.out.println("You have selected: " + player.getClassName());
    }
}
