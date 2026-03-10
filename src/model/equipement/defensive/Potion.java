package model.equipement.defensive;

public class Potion extends DefensiveEquipement {

    // --------- Constructeur ----------
    public Potion() {
        super("Soins", 5, "Potion de vie");

    }

    @Override
    public String toString() {
        return getName() +" / "+"Niveau défense : "+ getDefenseLevel()+" / "+"Type :" + getType();

    }
}

