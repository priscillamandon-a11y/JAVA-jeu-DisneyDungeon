package ui;

import model.Character;
import model.Player;

import java.util.Scanner;

public class Menu {
    // -------- Variabls d'instance --------
    Scanner scanner = new Scanner(System.in); // Scanner pour lire les choix utilisateur,

    // -------- Constructeur --------

    // -------- Methodes --------
    public int showMainMenu (){
        System.out.println("\n"+"***** == Bienvenue au Donjon Disney == *****"+"\n");
        System.out.println ("Taper 1 pour : Creer un personnage"+"\n"+"Taper 2 pour : Quitter le jeu");
        System.out.print("Quel est votre choix => ");

        return scanner.nextInt(); // lire la saisie utilisateur
    }

    public void quitGame(){
         System.out.println("\n Vous avez quitter le jeu, votre aventure s'arrête ici! \n"+"      ******** Au revoir ********\n");
    }

    public int askCharacterType(){
        System.out.println ("\nQuel type de personnage voulez-vous creer ? ");
        System.out.println("Taper 1 pour : Un Guerrier"+"\n"+"Taper 2 pour : Un Magicien \n"+"Taper 0 pour : Quitter");
        System.out.print("Votre choix => ");

        return scanner.nextInt();
    }

    public String askCharacterName(){
        System.out.print("\n"+"Choisissez un nom à votre personnage => ");
        System.out.println("\n(Taper 0 = Quitter)");
        return scanner.next();
    }
    // recap pour utilisateur + demande de demarrer la partie
    public int displayCharacter(Character character){
        System.out.println (character);
        System.out.println("\nTaper 1 = Démarrer la partie / Taper 0 = Quitter");
        return scanner.nextInt();

    }

    //Commençer l'aventure -> intro + récap
    public int startGame(Player player){
        System.out.println("*********************************\nDans les profondeurs d’un royaume oublié,\ndes héros se lèvent pour affronter mystères et dangers.\n" +
                "Le destin du donjon repose entre les mains de ceux qui oseront y entrer.\n*********************************\n");
        System.out.println("Vous êtes le : "+player.getCharacter().getType()+" "+player.getCharacter().getName()+","+"(Joueur "+player.getPlayerNumber()+")\n== VOTRE MISSION ==\nVous devez libérer le donjon de l'emprise du mal!\n*** Bonne chance ***");
        System.out.println("(Taper 1 = Lancer le dé / Taper 0 = Quitter)");
        return scanner.nextInt();

    }

    // Affiche le score du dé + la position joueur
    public int displayPosition(int diceResult, int position){
        System.out.println("Vous avez fait : "+diceResult);
        System.out.println("Vous êtes sur la case : "+position);
        System.out.println("Taper 1 = Lancer le dé / Taper 0 = Quitter");
        return scanner.nextInt();
    }



    // Affichage pour la fin de partie de jeu
    public void looseGame(){
        System.out.println("Vous avez été vaincu !!\n******** GAME OVER ********\n");
        System.out.println("Taper 1 = Recommencer une partie / Taper 0 = Quitter");
    }
    public void WinGame(){
        System.out.println("Vous avez gagné !! le Donjon est libéré!\n******** CONGRATS ********\n");
        System.out.println("Taper 1 = Recommencer une partie / Taper 0 = Quitter");
    }



    //scanner.close(); -> Pour fermer le clavier
}
