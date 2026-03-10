package model.equipement.defensive.care;

import model.equipement.defensive.DefensiveEquipement;

public class BiscuitSimba extends DefensiveEquipement {

    // constructeur
    public BiscuitSimba(){
        super("Biscuit de Simba",10,"Food");
    }

    @Override
    public String toString() {
        return getName() +" / "+": +"+ getDefenseLevel()+" PV" +" / "+"Type :" + getType();

    }
}
