package model.equipement.defensive;

public abstract class DefensiveEquipement {

    //-------- Variables d'instance --------
    private String type;
    private int defenseLevel;
    private String name;

    // -------- Constructeur ---------
    public DefensiveEquipement (String type,int defenseLevel,String name){
        this.type = type;
        this.defenseLevel = defenseLevel;
        this.name = name;
    }

    //-------- Methodes --------

    // Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public String getType() {
        return type;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getName() {
        return name;
    }

    // Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)

    public void setType(String type) {
        this.type = type;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methode spéciale -> transforme un objet en text lisible
    @Override
    public String toString() {
        return name +"Niveau defensif = "+defenseLevel;

    }
}
