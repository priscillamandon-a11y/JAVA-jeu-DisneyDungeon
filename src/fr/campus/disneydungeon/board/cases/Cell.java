package fr.campus.disneydungeon.board.cases;

import fr.campus.disneydungeon.badGuys.Enemy;
import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;
import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

public abstract class Cell {
    // -------- Variables -------
    public int index;

    // -------- Constructeur -------
    public Cell (int index){
        this.index = index;
    }

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

    // -------- Methodes abstraites ----------
    public abstract String getType();// cette methode ne donne pas de contenu, elle oblige les enfants à écrire le code et elles n'ont pas besoin de {}

    @Override // j'utilise abstract avec toString car c'est le modele de ma classe parent, grace à abstract Cell reste mon modele et oblige les enfants a avoir leur toString qui affichera ce que la case est sensée faire
    public abstract String toString();

    public  abstract String interact();

}

