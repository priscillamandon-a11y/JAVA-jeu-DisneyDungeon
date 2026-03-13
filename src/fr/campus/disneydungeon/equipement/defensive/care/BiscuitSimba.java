package fr.campus.disneydungeon.equipement.defensive.care;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;

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
