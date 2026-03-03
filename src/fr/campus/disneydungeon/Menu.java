package fr.campus.disneydungeon;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in); // Scanner pour lire les choix utilisateur

    public int showMainMenu (){
        System.out.println("=== Bienvenu au Donjon Disney ===");
        System.out.println ("Taper 1 pour : Creer un personnage"+"\n"+"ou"+"\n"+"Taper 2 pour : Quitter le jeu");
        System.out.println ("\n"+"Quel est votre choix => ");

        return scanner.nextInt(); // lire la saisie utilisateur
    }

    public String askCharacterType(){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Quel type de personnage voulez-vous creer ? ");
        System.out.println("Guerrier = taper 1"+"\n"+"ou"+"\n"+"Magicien =  taper 2");
        System.out.println ("\n"+"Votre choix => ");

        return scanner.next();
    }

    public String askCharacterName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println (" Nom de votre personnage =>  ");
        return scanner.next();
    }

    //scanner.close(); -> Pour fermer le clavier
}
