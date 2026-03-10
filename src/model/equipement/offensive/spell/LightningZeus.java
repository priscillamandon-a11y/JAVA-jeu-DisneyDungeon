package model.equipement.offensive.spell;

import model.equipement.offensive.OffensiveEquipement;

public class LightningZeus extends OffensiveEquipement {
    //constucteur
    public LightningZeus(){
        super("Eclair de Zeus",18,"Spell");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "+"+ getAttackLevel()+" dégâts"+" / "+"Type :" + getType();

    }
}
