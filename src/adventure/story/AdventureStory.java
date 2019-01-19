package adventure.story;

/**
 * @author Edward Flores
 * @date 1/18/2019
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
        player.getClass().cast(player);
        
        System.out.println("What would you like to do?"
                +"\n1) Attack"
                +"\n2) Defend");
        while(true){
            String action = input.nextLine();
            if(action.equals("1"))player.Attack();
            if(action.equals("2"))player.Defend();
            
        }
    }
    public static Player chooseClass(){
        Scanner input = new Scanner(System.in);
        boolean classChosen = false;
        while(!classChosen){
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
                    System.out.println("\nShowing stats\n");
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
                
                classChosen = true;
                
            }catch(NumberFormatException e){
                System.out.println("\nThat is not a number!\n");
            }catch(Exception e){
                e.getMessage();
            }
        }
        return chooseClass();//Just in case it returns an empty player.
    }
}
