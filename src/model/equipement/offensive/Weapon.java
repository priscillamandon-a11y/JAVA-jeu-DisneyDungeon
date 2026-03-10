package model.equipement.offensive;

public class Weapon extends OffensiveEquipement {

    // -------- Constructeur ------
    public Weapon (){
        super ("Armes", 10,"Epée à deux mains");
    }
    @Override
    public String toString() {
        return getName() +" / "+ "Niveau d'attaque : "+ getAttackLevel()+" / "+"Type :" + getType();

    }

}
