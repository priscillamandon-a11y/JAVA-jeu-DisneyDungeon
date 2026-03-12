package model.equipement.defensive;

/**
 * Super-classe des équipements défensifs.
 * Contient les propriétés communes à tous les objets défensifs.
 */
public abstract class DefensiveEquipement {

    //-------- Variables d'instance --------
    private String type;
    private int defenseLevel;
    private String name;

    /**
     * Initialise un équipement défensif.
     *
     * @param name         nom de l'équipement
     * @param defenseLevel niveau de défense
     * @param type         type (bouclier, soin, etc.)
     */
    // -------- Constructeur ---------
    public DefensiveEquipement (String name, int defenseLevel, String type){
        this.type = type;
        this.defenseLevel = defenseLevel;
        this.name = name;
    }

    //-------- Methodes --------

    /**
     * @return le type de l'équipement défensif
     */
    // Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public String getType() {
        return type;
    }

    /**
     * @return niveau de défense
     */
    public int getDefenseLevel() {
        return defenseLevel;
    }

    /**
     * @return le nom de l'équipement
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le type d'équipement.
     *
     * @param type nouveau type
     */
    // Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Met à jour le niveau de défense.
     *
     * @param defenseLevel nouvelle valeur
     */
    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    /**
     * Modifie le nom de l'équipement.
     *
     * @param name nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Chaîne descriptive de l'équipement pour l'affichage.
     *
     * @return description de l'équipement
     */
    //Methode spéciale -> transforme un objet en text lisible
    @Override
    public String toString() {
        return name +"Niveau defensif = "+defenseLevel;

    }
}
