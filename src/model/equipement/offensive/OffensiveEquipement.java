package model.equipement.offensive;

public class OffensiveEquipement {

    //-------- Variables d'instance (attributs) --------
    private String type; // armes ou sortilege
    private int attackLevel;
    private String name;

    //-------- Constructeur ---------
    public OffensiveEquipement (String type, int attackLevel, String name){
        // attributs
        this.type = type;
        this.attackLevel = attackLevel;
        this.name = name;
    }
    //-------- Methodes --------

    // Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public String getType() {
        return type;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public String getName() {
        return name;
    }

    // Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)
    public void setType(String type) {
        this.type = type;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methode spéciale -> transforme un objet en text lisible
    @Override
    public String toString() {
        return "[Nom = "+name+" /Niveau d'attaque = "+attackLevel+" /Type = "+type+"]";
    }
}
