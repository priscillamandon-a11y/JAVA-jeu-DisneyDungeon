package fr.campus.disneydungeon.equipement.defensive.protect;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;

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
