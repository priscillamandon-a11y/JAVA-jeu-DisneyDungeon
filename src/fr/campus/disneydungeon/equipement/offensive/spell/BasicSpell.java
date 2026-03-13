package fr.campus.disneydungeon.equipement.offensive.spell;

import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

public class BasicSpell extends OffensiveEquipement {

    // ---------- Constructeur -------
    public BasicSpell(){
        super("Flamme Dansante",10,"Magie");

    }
    @Override
    public String toString() {
        return getName() +" / "+ "Niveau d'attaque : "+ getAttackLevel()+" / "+"Type :" + getType();

    }


}
