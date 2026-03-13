package fr.campus.disneydungeon.equipement.defensive.protect;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;

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
