package fr.campus.disneydungeon.game.player;

import fr.campus.disneydungeon.character.Character;

/**
 * Représente un joueur dans le jeu, associant un numéro et un personnage,
 * avec la position actuelle sur le plateau.
 */
public class Player {
    //-------- Variables d'instance (attributs)
    private int playerNumber;
    private fr.campus.disneydungeon.character.Character character;
    private int position;

    /**
     * Construit un joueur avec un numéro et un personnage.
     * La position est initialisée à 0 (départ du plateau).
     *
     * @param playerNumber numéro du joueur
     * @param character    personnage contrôlé par le joueur
     */
    //-------- Constructeur --------
    public Player (int playerNumber, fr.campus.disneydungeon.character.Character character){
        this.playerNumber = playerNumber;
        this.character = character;
        this.position = 0; // position 0 pour départ du plateau
    }

    //-------- Methodes -------

    /**
     * Retourne le personnage du joueur.
     *
     * @return personnage associé
     */
    // Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public fr.campus.disneydungeon.character.Character getCharacter() {
        return character;
    }

    /**
     * @return le numéro du joueur
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * @return position actuelle du joueur sur le plateau
     */
    public int getPosition() {
        return position;
    }

    /**
     * Définit le numéro du joueur.
     *
     * @param playerNumber nouveau numéro
     */
    //Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    /**
     * Associe un personnage au joueur.
     *
     * @param character personnage à donner
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * Met à jour la position du joueur sur le plateau.
     *
     * @param position nouvelle position
     */
    public void setPosition(int position) {
        this.position = position;
    }

}
