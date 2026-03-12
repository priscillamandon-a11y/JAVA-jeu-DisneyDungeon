package model.gameElements.cases;

import model.equipement.defensive.DefensiveEquipement;
import model.player.Player;


public class PotionCell extends Cell {

    // -------- Variables -------
    private DefensiveEquipement defensiveEquipement;

    // -------- Constructeur -------
    public PotionCell (DefensiveEquipement defensiveEquipement){
        this.defensiveEquipement = defensiveEquipement;
    }

    // -------- Methodes ----------

    public DefensiveEquipement getDefensiveEquipement() {
        return defensiveEquipement;
    }

    public void setDefensiveEquipement(DefensiveEquipement defensiveEquipement) {
        this.defensiveEquipement = defensiveEquipement;
    }

    /**
     * {@inheritDoc}
     */
    @Override // methode pour identifier le type de case (vide ou pas)
    public String getType() {
        return "potion";
    }

    @Override
    public String toString() {
        return "\n------- Vous trouvez une potion -------\n"
                + defensiveEquipement.toString();
    }

}

