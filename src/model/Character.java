package model;

public class Character {

    // Variables d'instance (ATTRIBUTS)
    private String name;
    private String type;
    private int life;
    private int attack;
    private DefensiveEquipement defensiveEquipement;
    private OffensiveEquipement offensiveEquipement;

    //-------- Constructeur --------
    public Character (String name, String type,int life, int attack,DefensiveEquipement defensiveEquipement, OffensiveEquipement offensiveEquipement) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.attack = attack;
        this.offensiveEquipement = offensiveEquipement;
        this.defensiveEquipement =defensiveEquipement;
    }

    //--------- Methodes ---------

    //Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public OffensiveEquipement getOffensiveEquipement() {
        return offensiveEquipement;
    }

    public DefensiveEquipement getDefensiveEquipement() {
        return defensiveEquipement;
    }

    //Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setOffensiveEquipement(OffensiveEquipement offensiveEquipement) {
        this.offensiveEquipement = offensiveEquipement;
    }

    public void setDefensiveEquipement(DefensiveEquipement defensiveEquipement) {
        this.defensiveEquipement = defensiveEquipement;
    }

    //Methode spéciale -> transforme un objet en text lisible
    @Override
    public String toString() {
        return "\n"+"-> Vous avez Choisi :\n"
                +"Le type :"+" "+type+"\n"
                +"Son nom sera :"+" "+name+"\n"
                +"-> Voici ses cractèristiques : \n"
                +"[ Niveau de vie = "+life+"\n"
                +" Force de frappe = "+attack+"\n"
                +" Equipement d'attaque = "+offensiveEquipement+"\n"
                +" Equipement defensif = "+defensiveEquipement+"\n ]";
    }

}


