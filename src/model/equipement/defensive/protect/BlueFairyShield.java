package model.equipement.defensive.protect;

import model.equipement.defensive.DefensiveEquipement;

public class BlueFairyShield extends DefensiveEquipement {

    // ---------- Constructeur ---------
    public BlueFairyShield(){
        super("Bouclier de la Fée Bleue",15,"Shield");

    }
    @Override
    public String toString() {
        return getName() +" / "+"+"+ getDefenseLevel()+" défense"+" / "+"Type :" + getType();

    }

}
