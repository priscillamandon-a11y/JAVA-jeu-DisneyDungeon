package fr.campus.disneydungeon.equipement.offensive.weapon;

import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

public class KingTritonTrident extends OffensiveEquipement {
    //constructeur
    public KingTritonTrident(){
        super("Trident du roi Triton",18,"Weapon");

    }
    @Override
    public String toString() {
        return getName() +" / "+ "+"+ getAttackLevel()+" dégâts"+" / "+"Type :" + getType();

    }
}
