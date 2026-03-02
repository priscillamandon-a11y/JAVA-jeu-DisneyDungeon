package fr.campus.disneydungeon;

public class OffensiveEquipement {
    //Variables d'instance (attributs)
    private String type; // armes ou sortilege
    private int attackLevel;
    private String name;

    // Constructeur
    public OffensiveEquipement (String type, int attackLevel, String name){
        // creation des attributs
        this.type = type;
        this.attackLevel = attackLevel;
        this.name = name;
    }
    // Methodes :
    // pour lire les valeurs -> GETTER
    public String getType() {
        return type;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public String getName() {
        return name;
    }
    // Methodes :
    // pour modifier les valeurs -> SETTER
    public void setType(String type) {
        this.type = type;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }


}
