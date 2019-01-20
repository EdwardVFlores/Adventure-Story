package adventure.story;

/**
 * @author Edward Flores
 * @date 1/18/2019
 */

import java.util.Scanner;
import adventure.story.Item.*;
public class AdventureStory {   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to adventure story where you fight monsters!");
        Scanner input = new Scanner(System.in);
        Player player = chooseClass();
        player.getClass().cast(player);
        System.out.println("\n" +player.getClassName() + " Selected!\n");
        
        System.out.println("What would you like to do?"
                +"\n1) Attack"
                +"\n2) Defend");
        
        while(true){
            System.out.print("--> ");
            String action = input.nextLine();
            switch (action) {
                case "1":
                    player.Attack();
                    break;
                case "2":
                    player.Defend();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public static Player chooseClass(){
        Scanner input = new Scanner(System.in); 
        boolean classChosen = false;
        while(!classChosen){
            System.out.println("Choose your class:");
            System.out.println("1) View Stats");
            System.out.println("2) Archer");
            System.out.println("3) Mage");
            System.out.println("4) Swordsman");
            System.out.print("Select by number ");
            try{
                int classNum = Integer.parseInt(input.nextLine());
                switch(classNum){
                    case 1: 
                        showStats();
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
                classChosen = true;
            }catch(NumberFormatException e){
                System.out.println("\nThat is not a number!\n");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return chooseClass(); //Just in case it returns an empty player.
    }
    
    public static void showStats(){
        Scanner input = new Scanner(System.in);
        boolean stopStatView = false;
        while(!stopStatView){ 
            System.out.println("\nShow stats for which class?");
            System.out.println("1) Exit Menu");
            System.out.println("2) Archer");
            System.out.println("3) Mage");
            System.out.println("4) Swordsman");
            System.out.print("Select by number ");
            try{
                int statNum = Integer.parseInt(input.nextLine());
                switch(statNum){
                    case 1:
                        System.out.println("\nExiting...\n");
                        stopStatView = true;
                        break;
                    case 2:
                        Archer archer = new Archer();
                        archer.showStats();
                        break;
                    case 3:
                        Mage mage = new Mage();
                        mage.showStats();
                        break;
                    case 4:
                        Swordsman swordsman = new Swordsman();
                        swordsman.showStats();
                        break;
                    default:
                        System.out.println("\n" + statNum + " is not an option. \n");
                        break;
                }
            }catch(Exception e){
                System.out.println("Oof");
            }
        }
    }
}
