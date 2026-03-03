package fr.campus.disneydungeon;

public class DefensiveEquipement {

    //Variables d'instance
    private String type;
    private int defenseLevel;
    private String name;

    // Constructeur :
    public DefensiveEquipement (String type,int defenseLevel,String name){
        this.type = type;
        this.defenseLevel = defenseLevel;
        this.name = name;
    }

    // Methodes :
    //pour lire les valeurs d'un attribut privé -> GETTER

    public String getType() {
        return type;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getName() {
        return name;
    }

    // Methodes :
    // pour modifier les valeurs d'un attributs privé -> SETTER

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
        return "Defensive Equipement [Type = "+type+" Defense Level = "+defenseLevel+" name = "+name+"]";
    }
}
