package fr.campus.disneydungeon;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in); // Scanner pour lire les choix utilisateur,

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

    public void displayCharacter(Character character){
        System.out.println (character);
    }



    //scanner.close(); -> Pour fermer le clavier
}
