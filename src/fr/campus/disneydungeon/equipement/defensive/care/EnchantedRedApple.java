package fr.campus.disneydungeon.equipement.defensive.care;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;

public class EnchantedRedApple extends DefensiveEquipement {

    // constructeur
    public EnchantedRedApple(){
        super("Pomme rouge enchantée",20,"Food");
    }
    @Override
    public String toString() {
        return getName() +" / "+": +"+ getDefenseLevel()+" PV" +" / "+"Type :" + getType();

    }
}
