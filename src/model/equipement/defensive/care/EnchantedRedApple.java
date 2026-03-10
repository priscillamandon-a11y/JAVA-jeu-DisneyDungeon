package model.equipement.defensive.care;

import model.equipement.defensive.DefensiveEquipement;

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
