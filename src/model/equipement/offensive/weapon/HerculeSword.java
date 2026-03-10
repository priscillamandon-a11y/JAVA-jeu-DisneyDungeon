package model.equipement.offensive.weapon;

import model.equipement.offensive.OffensiveEquipement;

public class HerculeSword extends OffensiveEquipement {
    //constructeur
    public HerculeSword(){
        super("Epée à deux main d'Hercule",18,"Weapon");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "+"+ getAttackLevel()+" dégâts"+" / "+"Type :" + getType();

    }
}
