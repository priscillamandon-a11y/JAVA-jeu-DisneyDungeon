package fr.campus.disneydungeon.equipement.offensive.spell;

import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

public class ArielStorm extends OffensiveEquipement {
    //constructeur
    public ArielStorm(){
        super("Tempête d'Ariel",15,"Spell");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "+"+ getAttackLevel()+" dégâts"+" / "+"Type :" + getType();

    }
}
