package model.equipement.offensive;

public class Spell extends OffensiveEquipement {

    // ---------- Constructeur -------
    public Spell (String type, int attackLevel, String name){
        super("Magie",10,"Boule de feu");

    }
    @Override
    public String toString() {
        return getName() +" / "+"Niveau Attaque : "+ getAttackLevel()+" / "+"Type :" + getType();

    }


}
