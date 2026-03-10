package model.equipement.offensive.spell;

import model.equipement.offensive.OffensiveEquipement;

public class DragonFire extends OffensiveEquipement {
    // constructeur
    public DragonFire(){
        super("Feu du dragon",20,"Spell");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "+"+ getAttackLevel()+" dégâts"+" / "+"Type :" + getType();

    }
}
