package fr.campus.disneydungeon.controller;

import model.*;
import model.Character;
import ui.Menu;

public class Game {
    // -------- Variables d'instances ----------
    private Menu menu;
    private model.Character character;
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

    // *** Les personnages ***
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
            String type = "Guerrier";
            this.character = new model.Character(name, type, 10 , 5,
                    new DefensiveEquipement("Shield",5,"Bouclier de départ"),
                    new OffensiveEquipement("Weapon",10,"Epée à deux main")
            );
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
    // Methode qui me permettra de modifier plus tard (si besoin) uniquement la classe Menu:
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
    // *** Quitter le jeu ***
    public void quitGame(){
        this.menu.quitGame(); // affiches les messages enregistrés dans Menu
        System.exit(0); // permet d'arreter le systeme (le zero indique que l'arret s'est bien passé)
    }

    // ********* Demarrage de l'aventure **************


    public void startGame(){
        int choice = menu.startGame(player);
        if(choice == 1){
            goGame();
        }else if (choice == 0){
        quitGame();
        }else {
        System.out.println("Saisie invalide");
        startGame();
    }
    }
    public void goGame(){
        // je fais ma boucle tant qu'elle n'atteint pas la fin du plateau
        while (player.getPosition() <= board.getSize()) {

            int diceResult = dice.rollOfDice(); // je recupere le resultat du dé
            int newPosition = player.getPosition() + diceResult; // je recupere la position du Joueur et la rajoute au dé

            // je mets une condition pour ne pas dépasser les 64 cases
            if (newPosition > board.getSize()) {
                newPosition = board.getSize();
            }
            player.setPosition(newPosition); // je modifie la position du joueur
            menu.displayPosition(diceResult, player.getPosition()); // j'affiche ou en est l'utilisateur
        }

        }

    }

