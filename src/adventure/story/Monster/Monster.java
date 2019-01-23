package adventure.story.Monster;

import adventure.story.Monster.BeginnerMobs.*;

/**
 * @author Edward Flores
 */
public class Monster {

    BeginnerMob mob;

    public Monster() {
        int randNum = (int) (Math.random() * 100 + 1);
        if (randNum < 75) {
            SewerRat sewerRat = new SewerRat();
            mob = sewerRat;
        } else if (randNum >= 75 && randNum < 90) {
            WildBoar wildBoar = new WildBoar();
            mob = wildBoar;
        } else if (randNum >= 80) {
            DyreWolf dyreWolf = new DyreWolf();
            mob = dyreWolf;
        }
    }

    public BeginnerMob getMob() {
        return mob;
    }

}
