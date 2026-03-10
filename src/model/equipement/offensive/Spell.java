package model.equipement.offensive;

public class Spell extends OffensiveEquipement {

    // ---------- Constructeur -------
    public Spell (){
        super("Magie",10,"Boule de feu");

    }
    @Override
    public String toString() {
        return getName() +" / "+ "Niveau d'attaque : "+ getAttackLevel()+" / "+"Type :" + getType();

    }


}
