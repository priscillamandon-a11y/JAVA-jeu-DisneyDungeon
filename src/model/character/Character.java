package model.character;

import model.equipement.defensive.DefensiveEquipement;
import model.equipement.offensive.OffensiveEquipement;

// on emploi abstract pour indiquer que Character devient le parent
public abstract class Character {

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
        return "\n---------------- Choix du "+getType()+" --------------------\n"
                    +"=> Son nom : " +getName()+"\n"
                    +"=> Points de Vie : "+getLife()+"\n"
                    +"=> Force de frappe : " +getAttack()+"\n"
                    +"Equipement Offensif : " +getOffensiveEquipement()+"\n"
                    +"Equipement Defensif : " +getDefensiveEquipement();
        }
    }




