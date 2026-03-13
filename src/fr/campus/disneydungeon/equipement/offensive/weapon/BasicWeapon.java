package fr.campus.disneydungeon.equipement.offensive.weapon;

import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

public class BasicWeapon extends OffensiveEquipement {

    // -------- Constructeur ------
    public BasicWeapon(){
        super ("Epée de départ", 2,"Weapon");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "Niveau d'attaque : "+ getAttackLevel()+" / "+"Type :" + getType();

    }

}
