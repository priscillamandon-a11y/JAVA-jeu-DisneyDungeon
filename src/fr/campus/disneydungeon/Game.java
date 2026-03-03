package fr.campus.disneydungeon;

public class Game {
    // -------- Variables d'instances ----------
    private Menu menu;
    private  Character character;


    // -------- constructeur ------------------
    public Game (){
        this.menu = new Menu();// permettra l'utilisation dans toutes mes fonctions

    }

    // ------- Methodes/ fonctions ---------------

    // Démarrage :
    public void start(){
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

    // Choix des personnages :
    public void createCharacter (){

        int typeChoice = this.menu.askCharacterType(); //je recupere depuis Menu
        if (typeChoice == 0){
            quitGame();
        }
        String name = this.menu.askCharacterName(); // je recupere depuis Menu
        if (name.equals("0")){ // .equals() permet de comparer le type String
            quitGame();
        }
    }

    public void quitGame(){
        this.menu.quitGame(); // affiches les messages enregistrés dans Menu
    }
}
