package fr.campus.disneydungeon.equipement.offensive;

/**
 * Super-classe pour les équipements offensifs (armes ou sorts).
 * Contient les caractéristiques communes.
 */
public abstract class OffensiveEquipement {

    //-------- Variables d'instance (attributs) --------
    private String type; // armes ou sortilege
    private int attackLevel;
    private String name;

    /**
     * Initialise un équipement offensif avec ses propriétés.
     *
     * @param name nom de l'équipement
     * @param attackLevel niveau d'attaque
     * @param type type (arme ou sort)
     */
    //-------- Constructeur ---------
    public OffensiveEquipement (String name, int attackLevel,String type){
        // attributs
        this.type = type;
        this.attackLevel = attackLevel;
        this.name = name;
    }
    //-------- Methodes --------

    /**
     * @return type d'équipement (arme ou sort)
     */
    // Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public String getType() {
        return type;
    }

    /**
     * @return niveau d'attaque
     */
    public int getAttackLevel() {
        return attackLevel;
    }

    /**
     * @return nom de l'équipement
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le type de l'équipement.
     *
     * @param type nouveau type
     */
    // Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Modifie le niveau d'attaque.
     *
     * @param attackLevel nouvelle valeur
     */
    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    /**
     * Change le nom de l'équipement.
     *
     * @param name nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne une chaîne descriptive de l'équipement.
     *
     * @return description contenant le nom et le niveau d'attaque
     */
    //Methode spéciale -> transforme un objet en text lisible
    @Override
    public String toString() {
        return name+", Niveau d'attaque = "+attackLevel;
    }
}
