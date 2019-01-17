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
        Player player = chooseClass();
        String action = input.nextLine();
        if(action.equals("viewstats")){
            player.getStats();
        }
    }
    public static Player chooseClass(){
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        while(!player.classChosen){
            try{
                System.out.println("Choose your class:");
                System.out.println("1) View Stats");
                System.out.println("2) Archer");
                System.out.println("3) Mage");
                System.out.println("4) Swordsman");
                System.out.print("Select by number ");
                int classNum = Integer.parseInt(input.nextLine());
                switch(classNum){
                case 1:
                    System.out.println("Showing stats");
                    break;
                case 2:
                    player = new Archer();
                    break;
                case 3:
                    player = new Mage();
                    break;
                case 4:
                    player = new Swordsman();
                    break;
                default:
                    System.out.println("\n" + classNum + " is not an option. \n");
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("That's not a number!");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("\nYou have selected the "+player.getClassName()+" class! \n");
        return player;
    }
}
