package model.gameElements.cases;

import model.equipement.offensive.OffensiveEquipement;
import model.player.Player;

public class WeaponCell extends Cell {

    // -------- Variables -------
    private OffensiveEquipement offensiveEquipement;

    // -------- Constructeur -------
    public WeaponCell(OffensiveEquipement offensiveEquipement){
        this.offensiveEquipement = offensiveEquipement;
    }

    // -------- Methodes ----------

    public OffensiveEquipement getOffensiveEquipement() {
        return offensiveEquipement;
    }

    public void setOffensiveEquipement(OffensiveEquipement offensiveEquipement) {
        this.offensiveEquipement = offensiveEquipement;
    }

    @Override // methode pour identifier le type de case (vide ou pas)
    public String getType() {
        return "weapon";
    }

    @Override
    public String toString() {
        return "\n------- Vous trouvez une arme  -------\n"
                + offensiveEquipement.toString();
    }
}
