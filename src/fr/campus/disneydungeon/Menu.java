package fr.campus.disneydungeon;

import java.util.Scanner;

public class Menu {
    // -------- Variabls d'instance --------
    Scanner scanner = new Scanner(System.in); // Scanner pour lire les choix utilisateur,
    private Board board;
    private Dice dice;
    private Character character;
    private Player player;

    // -------- Constructeur --------

    // -------- Methodes --------
    public int showMainMenu (){
        System.out.println("\n"+"***** == Bienvenu au Donjon Disney == *****"+"\n");
        System.out.println ("Taper 1 pour : Creer un personnage"+"\n"+"Taper 2 pour : Quitter le jeu");
        System.out.print("\n"+"Quel est votre choix => ");

        return scanner.nextInt(); // lire la saisie utilisateur
    }

    public void quitGame(){
         System.out.println("\n Vous avez quitter le jeu, votre aventure s'arrête ici! \n"+"      ******** Au revoir ********\n");
    }

    public int askCharacterType(){
        System.out.println ("Quel type de personnage voulez-vous creer ? ");
        System.out.println("Taper 1 pour : Un Guerrier"+"\n"+"Taper 2 pour : Un Magicien \n"+"Taper 0 pour : Quitter");
        System.out.print ("\n"+"Votre choix => ");

        return scanner.nextInt();
    }

    public String askCharacterName(){
        System.out.println("(Taper 0 = Quitter)");
        System.out.print("Donner un nom à votre personnage => ");
        return scanner.next();
    }
    // recap choix utilisateur
    public int displayCharacter(Character character){
        System.out.println (character);
        System.out.println("\nDémarrer la partie = appuyer sur 1");
        System.out.println("(Taper 0 = Quitter)");
        return scanner.nextInt();

    }

    //Commençer l'aventure -> intro + récap
    public int startGame(Player player){
        System.out.println(" ******* Dans les profondeurs d’un royaume oublié, des héros se lèvent pour affronter mystères et dangers.\n" +
                "Le destin du donjon repose entre les mains de ceux qui oseront y entrer. *******");
        System.out.println("Vous êtes : "+player.getCharacter().getName()+" "+player.getCharacter().getType()+","+"(Joueur "+player.getPlayerNumber()+")");
        System.out.println("(Taper 0 = Quitter, Taper 1 = continuer)");
        return scanner.nextInt();

    }

    // Affiche le score du dé + la position joueur
    public void displayPosition(int diceResult, int position){
        System.out.println("Vous avez fait : "+diceResult);
        System.out.println("Vous êtes sur la case : "+position);
    }



    //scanner.close(); -> Pour fermer le clavier
}
