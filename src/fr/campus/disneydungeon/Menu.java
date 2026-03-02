package fr.campus.disneydungeon;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in); // Scanner pour lire les choix utilisateur

    public int showMainMenu (){
        System.out.println("=== Bienvenu sur le Donjon Disney ===");
        System.out.println ("Saisir 1 pour creer un personnage ou saisir 2 pour quitter");
        System.out.println ("Quel est votre choix => ");

        return scanner.nextInt(); // lire la saisie utilisateur
    }

    public String askCharacterType(){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Quel type de personnage voulez-vous creer ? ");
        System.out.println("Guerrier ou Magicien ?");
        System.out.println ("Saisir votre choix => ");

        return scanner.next();
    }

    public String askCharacterName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println (" Nom de votre personnage =>  ");
        return scanner.next();
    }

    //scanner.close(); -> Pour fermer le clavier
}
