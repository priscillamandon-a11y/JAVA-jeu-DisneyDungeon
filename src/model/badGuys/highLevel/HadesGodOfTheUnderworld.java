package model.badGuys.highLevel;

import model.badGuys.Enemy;

public class HadesGodOfTheUnderworld extends Enemy {

    // Constructeur
    public HadesGodOfTheUnderworld(){
        super("Hades","Dieu des Enfers au tempérament explosif contrôlant les flammes bleues.",
                "Magie",100,20,16);
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
