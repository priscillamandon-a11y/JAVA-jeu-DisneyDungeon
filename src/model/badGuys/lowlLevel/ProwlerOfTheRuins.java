package model.badGuys.lowlLevel;

import model.badGuys.Enemy;

public class ProwlerOfTheRuins extends Enemy {

    // ---------- Constructeur --------
    public ProwlerOfTheRuins(String name, String description, String Type, int lifeLevel, int attackPower, int defense) {
        super("Le Rôdeur des Ruines", "Gros cafard, Prédateur furtif, utilisant l’environnement pour tendre des embuscades et affaiblir ses proies.",
                "Créature", 15, 4, 5);
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
