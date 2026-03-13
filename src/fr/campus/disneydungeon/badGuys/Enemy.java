package fr.campus.disneydungeon.badGuys;

/**
 * Classe abstraite modélisant un ennemi dans le jeu.
 * Les sous-classes décrivent des types spécifiques d'ennemis.
 */
public abstract class Enemy {

    // Variables d'instance (ATTRIBUTS)
    private String name;
    private String description;
    private String type;
    private int lifeLevel;
    private int attackPower;
    private int defense;

/**
     * Initialise un ennemi avec les caractéristiques données.
     *
     * @param name        nom de l'ennemi
     * @param description description textuelle
     * @param type        catégorie/type de l'ennemi
     * @param lifeLevel   niveau de vie initial
     * @param attackPower force d'attaque
     * @param defense     valeur de défense
     */
    // --------- Constructeur ---------------
    public Enemy (String name, String description, String type, int lifeLevel, int attackPower, int defense){
        this.name = name;
        this.description = description;
        this.type = type;
        this.lifeLevel = lifeLevel;
        this.attackPower = attackPower;
        this.defense = defense;
    }
/**
     * @return le nom de l'ennemi
     */
    // -------- les GETTERS ------------------
    public String getName() {
        return name;
    }

/**
     * @return la description de l'ennemi
     */
    public String getDescription() {
        return description;
    }

/**
     * @return le type/catégorie de l'ennemi
     */
    public String getType() {
        return type;
    }

/**
     * @return le niveau de vie de l'ennemi
     */
    public int getLifeLevel() {
        return lifeLevel;
    }

/**
     * @return la puissance d'attaque
     */
    public int getAttackPower() {
        return attackPower;
    }

/**
     * @return la valeur de défense
     */
    public int getDefense() {
        return defense;
    }

/**
     * Modifie le nom de l'ennemi.
     *
     * @param name nouveau nom
     */
    // ---------- les SETTERS ------------------
    public void setName(String name) {
        this.name = name;
    }

/**
     * Définit une nouvelle description.
     *
     * @param description nouvelle description
     */
    public void setDescription(String description) {
        this.description = description;
    }

/**
     * Change le type de l'ennemi.
     *
     * @param type nouveau type
     */
    public void setType(String type) {
        this.type = type;
    }

/**
     * Met à jour le niveau de vie.
     *
     * @param lifeLevel nouvelles PV
     */
    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

/**
     * Modifie la puissance d'attaque.
     *
     * @param attackPower nouvelle puissance
     */
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

/**
     * Définit la valeur de défense.
     *
     * @param defense nouvelle défense
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

/**
     * Chaîne décrivant l'ennemi pour affichage à l'écran.
     *
     * @return représentation textuelle de l'ennemi
     */
    // --------------- Affichage des ennemis -------------------
    @Override
    public String toString() {
        return ">>>>>>>> ATTENTION <<<<<<<<\n>>>>>> Vous êtes attaqué!! <<<<<<\n"
                + "\n===> " + getName() + " <===" + "\n"
                + "Sa catégorie : " + getType() + "\n"
                + "Description : " + getDescription() + "\n"
                + "Niveau de vie : " + getLifeLevel() + "\n"
                + "Force d'attaque : " + getAttackPower() + "\n"
                + "Défense : " + getDefense() + "\n"
                + ">>>>>>>> Que souhaitez vous faire ? <<<<<<<<\n";
    }

}
