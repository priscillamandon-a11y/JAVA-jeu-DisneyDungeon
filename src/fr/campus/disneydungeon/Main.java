package fr.campus.disneydungeon;

import fr.campus.disneydungeon.controller.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameIntro(); // démarrer le jeu
        game.startGame();// Commencer l'aventure
    }
}