package fr.campus.disneydungeon.equipement.offensive.weapon;

import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

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
