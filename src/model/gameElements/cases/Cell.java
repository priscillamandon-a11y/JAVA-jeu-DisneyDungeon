package model.gameElements.cases;

import model.badGuys.Enemy;
import model.equipement.defensive.DefensiveEquipement;
import model.equipement.offensive.OffensiveEquipement;
import model.player.Player;

public abstract class Cell {
    // -------- Variables -------

    // -------- Constructeur -------

    // -------- Methodes abstraites ----------

    // cette methode ne donne pas de contenu, elle oblige les enfants à écrire le code et elles n'ont pas dbesoin de {}
        public abstract String getType();

    // j'utilise abstract avec toString car c'est le modele de ma classe parent, grace à abstract Cell reste mon modele et oblige les enfants a avoir leur toString qui affichera ce que la case est sensée faire
    @Override
    public abstract String toString();

    // ----- Methodes ------
    public Enemy getEnemy(){
        return null;
    }
    public DefensiveEquipement getDefensiveEquipement() {
        return null;
    }
    public OffensiveEquipement getOffensiveEquipement() {
        return null;
    }

}

