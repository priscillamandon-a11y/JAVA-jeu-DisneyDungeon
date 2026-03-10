package model.equipement.defensive.protect;

import model.equipement.defensive.DefensiveEquipement;

public class BasicShield extends DefensiveEquipement {
    // constructeur
    public BasicShield(){
        super("Bouclier de départ",5,"Shield");
    }
    @Override
    public String toString() {
        return getName() +" / "+"+"+ getDefenseLevel()+" défense"+" / "+"Type :" + getType();

    }
}
