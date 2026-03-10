package model.badGuys.mediumLevel;

import model.badGuys.Enemy;

public class ScarLion extends Enemy {

    // Constructeur
    public ScarLion (String name, String description, String Type, int lifeLevel, int attackPower, int defense){
        super("Scar","Lion rusé et cruel qui attaque avec vitesse et stratégie.",
                "Créature",50,11,8);
    }
    @Override
    public String toString() {
        return "\n------- Un ennemis est là -------\n"
                + "===> " + getName() + " <===" + "\n"
                + "Sa catégorie : " + getType() + "\n"
                + "Description : " + getDescription() + "\n"
                + "Niveau de vie : " + getLifeLevel() + "\n"
                + "Force d'attaque : " + getAttackPower() + "\n"
                + "Défense : " + getDefense() + "\n";
    }
}
