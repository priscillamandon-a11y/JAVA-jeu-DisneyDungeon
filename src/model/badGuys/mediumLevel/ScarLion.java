package model.badGuys.mediumLevel;

import model.badGuys.Enemy;

public class ScarLion extends Enemy {

    // Constructeur
    public ScarLion (){
        super("Scar","Lion rusé et cruel qui attaque avec vitesse et stratégie.",
                "Créature",50,11,8);
    }
    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
