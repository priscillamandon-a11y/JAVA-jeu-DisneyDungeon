package fr.campus.disneydungeon;

public class Game {
    // -------- Variables d'instances ----------
    private Menu menu;

    // -------- constructeur ------------------
    public Game (){
        this.menu = new Menu(); // permettra l'utilisation dans toutes mes fonctions
    }

    // ------- Methodes/ fonctions ---------------

    public void start(){
        int choice = this.menu.showMainMenu();

        if(choice == 1){
            createCharacter();
        } else {
            System.out.println("Vous avez quitter le jeu");
        }
    }
    public void createCharacter (){
        // je recupere les infos qui se trouvent dans menu:
        String type = this.menu.askCharacterType();
        String name = this.menu.askCharacterName();
    }


}
