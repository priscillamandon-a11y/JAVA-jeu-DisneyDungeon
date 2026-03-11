package model.player;

import model.character.Character;

public class Player {
    //-------- Variables d'instance (attributs)
    private int playerNumber;
    private model.character.Character character;
    private int position;

    //-------- Constructeur --------
    public Player (int playerNumber, model.character.Character character){
        this.playerNumber = playerNumber;
        this.character = character;
        this.position = 0; // position 0 pour départ du plateau
    }

    //-------- Methodes -------

    // Getter (Pour pouvoir lire les valeurs de mes varaibles privés dans mes autres classes)
    public model.character.Character getCharacter() {
        return character;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getPosition() {
        return position;
    }

    //Setter (Pour modifier les valeurs de mes varaibles privés dans les autres classes)
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
