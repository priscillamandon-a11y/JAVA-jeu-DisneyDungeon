package model.gameElements.cases;

import model.equipement.defensive.DefensiveEquipement;
import model.player.Player;


public class PotionCell extends Cell {

    // -------- Variables -------
    private DefensiveEquipement defensiveEquipement;

    // -------- Constructeur -------
    public PotionCell (int index, DefensiveEquipement defensiveEquipement){
        super(index);
        this.defensiveEquipement = defensiveEquipement;
    }

    // -------- Methodes ----------

    public DefensiveEquipement getDefensiveEquipement() {
        return defensiveEquipement;
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
    @Override
    public String interact() {
        return "Défense : " + getDefensiveEquipement().getName();
    }

}

