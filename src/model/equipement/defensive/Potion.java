package model.equipement.defensive;

public class Potion extends DefensiveEquipement {

    // --------- Constructeur ----------
    public Potion(String type, DefensiveEquipement defensiveEquipement, String name){
        super ("Soins",5,"Potion de vie");

        }

    @Override
    public String toString() {
        return "---- Détail :";
    }
}

