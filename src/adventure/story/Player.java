/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure.story;

/**
 *
 * @author EdwardsWife
 */
public class Player {
    private final String className;
    private int health,defense;
    public boolean classChosen = false;
    
    public Player(){
        this.className = "Human";
        this.health = 1;
        this.defense = 1;
    }
    public Player(String className){
        this.className = className;
        this.classChosen = true;
        System.out.println("\nYou have selected the "+this.className+" class!\n");
        this.getStats();
    }
    public void getStats(){
        System.out.println("Class: " + this.className+
                          "\nHealth: " + this.health +
                          "\nDefense: " + this.defense);
    }
    public String getClassName(){
        return this.className;
    }
    public int getHealth(){
        return this.health;
    }
    public int getDefense(){
        return this.defense;
    }
    public void changeHealth(int health){
        this.health += health;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    
}
