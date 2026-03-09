package model.gameElements.cases;

import model.equipement.offensive.OffensiveEquipement;

public class WeaponCell extends Cell {
    // Variables
    private OffensiveEquipement offensiveEquipement;

    // Constructeur
    public WeaponCell(OffensiveEquipement offensiveEquipement){
        this.offensiveEquipement = offensiveEquipement;
    }

    @Override
    public String toString() {
        return "\n------- Vous trouvez une arme  -------\n"
                + offensiveEquipement.toString();
    }
}
