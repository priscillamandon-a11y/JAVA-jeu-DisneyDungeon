package fr.campus.disneydungeon.main;

import fr.campus.disneydungeon.game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameIntro(); // intro du jeu
        game.startGame();// Commencer l'aventure
    }
}