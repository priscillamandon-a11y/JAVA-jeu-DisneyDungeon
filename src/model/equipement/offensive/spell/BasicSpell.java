package model.equipement.offensive.spell;

import model.equipement.offensive.OffensiveEquipement;

public class BasicSpell extends OffensiveEquipement {

    // ---------- Constructeur -------
    public BasicSpell(){
        super("Magie",10,"Boule de feu");

    }
    @Override
    public String toString() {
        return getName() +" / "+ "Niveau d'attaque : "+ getAttackLevel()+" / "+"Type :" + getType();

    }


}
