package fr.campus.disneydungeon.equipement.defensive.care;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;

public class PotionTinkerbell extends DefensiveEquipement {

    // --------- Constructeur ----------
    public PotionTinkerbell() {
        super("Potion Fée clochette", 30,"Care");

    }

    @Override
    public String toString() {
        return getName() +" / "+": +"+ getDefenseLevel()+" PV" +" / "+"Type :" + getType();

    }
}

