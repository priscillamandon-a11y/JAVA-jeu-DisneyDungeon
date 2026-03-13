package fr.campus.disneydungeon.board.cases;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;


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
        return "\n------- Vous trouvez un objet -------\n"
                + defensiveEquipement.toString();
    }
    @Override
    public String interact() {
        return "Défense : " + getDefensiveEquipement().getName();
    }

}

