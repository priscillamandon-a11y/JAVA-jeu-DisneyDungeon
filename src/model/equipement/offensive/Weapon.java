package model.equipement.offensive;

public class Weapon extends OffensiveEquipement{

    // -------- Constructeur ------
    public Weapon (String type, int attackLevel, String name){
        super ("Armes", 10,"Epée à deux mains");
    }
    @Override
    public String toString() {
        return "---- Détail :";
    }
}
