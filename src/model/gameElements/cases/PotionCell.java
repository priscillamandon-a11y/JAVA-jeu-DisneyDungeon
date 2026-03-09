package model.gameElements.cases;

import model.equipement.defensive.DefensiveEquipement;

public class PotionCell extends Cell {

    //Variables
    private DefensiveEquipement defensiveEquipement;

    // Constructeur
    public PotionCell (DefensiveEquipement defensiveEquipement){
        this.defensiveEquipement = defensiveEquipement;
    }

    @Override
    public String toString() {
        return "\n------- Vous trouvez une potion -------\n"
                + defensiveEquipement.toString();
    }

}

