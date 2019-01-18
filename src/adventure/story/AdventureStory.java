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
//                    Write a method to choose which stat to show for each class
//                        1) Choose which stat to show
//                        2) Print out the selected stat
                    break;
                case 2:
                    return new Archer();
                case 3:
                    return new Mage();
                case 4:
                    return new Swordsman();
                default:
                    System.out.println("\n" + classNum + " is not an option. \n");
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("\nThat is not a number!\n");
            }catch(Exception e){
                e.getMessage();
            }
        }
        return player;
    }
}
