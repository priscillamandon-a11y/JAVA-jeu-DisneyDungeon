package model.badGuys.lowlLevel;

import model.badGuys.Enemy;

public class SnakeKaa extends Enemy {

    // ---------- Constructeur --------
    public SnakeKaa(String name, String description, String Type, int lifeLevel, int attackPower, int defense){
        super("Kaa","Serpent hypnotique capable d’endormir ses adversaires avant de frapper",
                "Créature",30, 8,7);
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
