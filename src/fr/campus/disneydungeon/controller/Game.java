package fr.campus.disneydungeon.controller;

import model.character.Character;
import model.character.Warrior;
import model.equipement.defensive.DefensiveEquipement;
import model.equipement.defensive.Shield;
import model.equipement.offensive.OffensiveEquipement;
import model.equipement.offensive.Weapon;
import model.gameElements.Board;
import model.gameElements.Dice;
import model.player.Player;
import ui.Menu;

public class Game {
    // -------- Variables d'instances ----------
    private Menu menu;
    private Character character;
    private Board board;
    private Dice dice;
    private Player player;


    // -------- constructeur ------------------
    public Game (){
        //Creation des objets
        this.menu = new Menu();// permet l'utilisation dans toutes mes fonctions
        this.board = new Board(64);
        this.dice = new Dice(6);

    }

    // ------- Methodes/ fonctions ---------------

    // *** Démarrage - Menu principal ***
    public void gameIntro(){
        // Menu principal :
        int choice = this.menu.showMainMenu();

        if(choice == 1){
            createCharacter();
        } else if (choice == 2){
            quitGame();
        } else {
            System.out.println("Saisie invalide");
            quitGame();
        }
    }

    // ********* Les personnages *********
    public void createCharacter(){

        //Choix type de personnage :
        int typeChoice = this.menu.askCharacterType(); //je recupere depuis Menu
        if (typeChoice == 0){
            quitGame();
        }
        // Personnalisation nom personnage :
        String name = this.menu.askCharacterName(); // je recupere depuis Menu
        if (name.equals("0")){ // .equals() permet de comparer le type String
            quitGame();
        }

        // Creation du personnage selon le type choisi :
        if (typeChoice == 1){
            this.character = new Warrior(name, new Shield("Protection",5,"Bouclier de départ"),
                    new Weapon("Armes",10,"Epée à deux mains"));

        } else if (typeChoice == 2){
            String type = "Sorcier";
            this.character = new Character(name, type, 5 , 8,
                    new DefensiveEquipement("Potion",5,"Potion de vie"),
                    new OffensiveEquipement("Spell",10,"Sort explosif")
            );
        } else {
            quitGame();
        }
        // creation du numero du joueur
        this.player = new Player(1,character);// Creation du player après le choix du personnage pour que je puisse l'utiliser dans mes autres methodes

        displayCharacter(); // j'appel la methode depuis la class Menu pour Afficher le personnage:
    }
    // Afficher le personnage choisi
    public void displayCharacter(){
        int choice = this.menu.displayCharacter(character);
        if (choice == 1){
            startGame();
        }else if (choice == 0){
            quitGame();
        }else {
            System.out.println("Saisie invalide");
            startGame();
        }
    }

    //********* Quitter le jeu *********
    public void quitGame(){
        this.menu.quitGame(); // affiches les messages enregistrés dans Menu
        System.exit(0); // permet d'arreter le systeme (le zero indique que l'arret s'est bien passé)
    }

    // ********* Demarrage de l'aventure **************

    public void startGame(){
        menu.startGame(player); // j'appelle mon intro de jeu

        while (player.getPosition() < board.getSize()) { // je boucle tant que l'utilisateur n'est pas àla derniere case du plateau
            int choice = menu.askRollDice(); // j'initialise le choix utilisateur

            if(choice == 1){
                int diceResult = dice.rollOfDice(); // je recupere le resultat du dé
                int newPosition = player.getPosition() + diceResult; // je recupere la position du Joueur et la rajoute au dé
                // je mets une condition pour ne pas dépasser les 64 cases
                if (newPosition > board.getSize()) {
                    newPosition = board.getSize();
                }
                player.setPosition(newPosition); // je modifie la position du joueur
                menu.displayPosition(diceResult, player.getPosition()); // j'affiche ou en est l'utilisateur

            } else if(choice == 0){
                    quitGame();
            } else {
                System.out.println("Saisie invalide");
                menu.displayCharacter(character);
            }
        }
        endOfGame();
    }

    // ********* FIN DE PARTIE *********
    public void endOfGame (){
        int choice = menu.winGame();

        if (choice == 1){
            player.setPosition(1); // remettre le joueur en position 1
            startGame();// recommencer le jeu
        } else if (choice == 0){
            quitGame();
        } else {
            System.out.println("Saisie invalide");
            endOfGame();
        }

    }

}

