package model.character;

import model.equipement.defensive.DefensiveEquipement;
import model.equipement.offensive.OffensiveEquipement;

/**
 * Classe abstraite représentant un personnage du jeu.
 * Les sous-classes (par exemple Warrior ou Wizard) héritent des
 * attributs et méthodes définis ici.
 */
// on emploi abstract pour indiquer que Character devient le parent
public abstract class Character {

    // Variables d'instance (ATTRIBUTS)
    private String name;
    private String type;
    private int life;
    private int attack;
    private DefensiveEquipement defensiveEquipement;
    private OffensiveEquipement offensiveEquipement;

    /**
     * Construit un {@code Character} avec des équipements et statistiques
     * initiales.
     *
     * @param name                  nom du personnage
     * @param type                  type/classe du personnage
     * @param life                  points de vie initiaux
     * @param attack                force d'attaque initiale
     * @param defensiveEquipement   équipement défensif attribué
     * @param offensiveEquipement   équipement offensif attribué
     */
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

    /**
     * Retourne le nom du personnage.
     *
     * @return le nom du personnage
     */
    //Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public String getName() {
        return name;
    }

    /**
     * Retourne le type (classe) du personnage.
     *
     * @return le type du personnage
     */
    public String getType() {
        return type;
    }

    /**
     * Retourne les points de vie restants du personnage.
     *
     * @return points de vie
     */
    public int getLife() {
        return life;
    }

    /**
     * Retourne la force d'attaque du personnage.
     *
     * @return force d'attaque
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Retourne l'équipement offensif du personnage.
     *
     * @return l'équipement offensif
     */
    public OffensiveEquipement getOffensiveEquipement() {
        return offensiveEquipement;
    }

    /**
     * Retourne l'équipement défensif du personnage.
     *
     * @return l'équipement défensif
     */
    public DefensiveEquipement getDefensiveEquipement() {
        return defensiveEquipement;
    }

    /**
     * Définit le nom du personnage.
     *
     * @param name nouveau nom
     */
    //Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Définit le type (classe) du personnage.
     *
     * @param type nouveau type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Modifie les points de vie du personnage.
     *
     * @param life nouveaux points de vie
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * Modifie la force d'attaque du personnage.
     *
     * @param attack nouvelle valeur d'attaque
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Assigne un équipement offensif au personnage.
     *
     * @param offensiveEquipement l'équipement à attribuer
     */
    public void setOffensiveEquipement(OffensiveEquipement offensiveEquipement) {
        this.offensiveEquipement = offensiveEquipement;
    }

    /**
     * Assigne un équipement défensif au personnage.
     *
     * @param defensiveEquipement l'équipement à attribuer
     */
    public void setDefensiveEquipement(DefensiveEquipement defensiveEquipement) {
        this.defensiveEquipement = defensiveEquipement;
    }

    /**
     * Représentation textuelle du personnage, utilisée dans l'affichage
     * de l'interface.
     *
     * @return description lisible du personnage
     */
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




