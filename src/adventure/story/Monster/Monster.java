package adventure.story.Monster;

import adventure.story.Monster.BeginnerMobs.*;

/**
 * @author Edward Flores
 */
public class Monster {

    BeginnerMob mob;

    public Monster() {
        int randNum = (int) (Math.random() * 50 + 1);
        if (randNum < 70) {
            SewerRat sewerRat = new SewerRat();
            mob = sewerRat;
        } else if (randNum >= 70 && randNum < 90) {
            WildBoar wildBoar = new WildBoar();
            mob = wildBoar;
        } else if (randNum >= 90) {
            DyreWolf dyreWolf = new DyreWolf();
            mob = dyreWolf;
        }
    }

    public BeginnerMob getMob() {
        return mob;
    }

}
