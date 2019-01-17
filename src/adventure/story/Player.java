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
    private String className;
    public Player(){
        this.className = "human";
    }
    public Player(String className){
        this.className = className;
    }
    public String getClassName(){
        return className;
    }
    public void setClassName(String className){
        this.className = className;
    }
}
