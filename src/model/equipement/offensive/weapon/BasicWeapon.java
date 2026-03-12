package model.equipement.offensive.weapon;

import model.equipement.offensive.OffensiveEquipement;

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
