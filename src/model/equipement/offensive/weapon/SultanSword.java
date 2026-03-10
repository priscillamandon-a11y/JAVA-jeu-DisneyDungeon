package model.equipement.offensive.weapon;

import model.equipement.offensive.OffensiveEquipement;

public class SultanSword extends OffensiveEquipement {

    // constructeur
    public SultanSword(){
        super("Sabre du Sultan", 12,"Weapon");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "+"+ getAttackLevel()+" dégâts"+" / "+"Type :" + getType();

    }
}
