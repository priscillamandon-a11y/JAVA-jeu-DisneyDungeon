package model.equipement.defensive.protect;

import model.equipement.defensive.DefensiveEquipement;

public class HerculeShield extends DefensiveEquipement {

    // constructeur
    public HerculeShield(){
        super("Bouclier d'Hercule",9,"shield");
    }
    @Override
    public String toString() {
        return getName() +" / "+"+"+ getDefenseLevel()+" défense"+" / "+"Type :" + getType();

    }
}
