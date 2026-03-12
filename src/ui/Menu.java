package ui;

import model.character.Character;
import model.player.Player;

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
        System.out.println("\n    ============================= ");
        System.out.println("Vous avez quitter le jeu, votre aventure s'arrête ici!");
        System.out.println("      ========== Au revoir ==========\n");
    }

    public int askCharacterType(){
        System.out.println ("\nQuel type de personnage voulez-vous creer ? ");
        System.out.println("Taper 1 pour : Un Guerrier"+"\n"+"Taper 2 pour : Un Sorcier \n"+"Taper 0 pour : Quitter");
        System.out.print("Votre choix => ");

        return scanner.nextInt();
    }

    public String askCharacterName(){
        System.out.print("\n"+"Choisissez un nom à votre personnage (Taper 0 = Quitter) => ");
        return scanner.next();
    }
    // recap pour utilisateur + demande de demarrer la partie
    public int displayCharacter(Character character){
        System.out.println (character);
        System.out.println("------------------------------------------------------");
        System.out.print("Taper 1 = Démarrer la partie / Taper 0 = Quitter : ");
        return scanner.nextInt();

    }
    // Apperçu du personnage :
    public int previewCharacter(Character character){
        System.out.println("---------> Aperçu du personnage <---------\n"
                + "=> Vous êtes un "+character.getType()+"\n"
                + "=> Vous avez : "+character.getLife()+" PV"+"\n"
                + "=> Vous avez : "+character.getAttack()+" de force de frappe");
        System.out.println("------> Votre équipement actuel <------\n"
                +"Pour l'attaque : "+character.getOffensiveEquipement()
                +"\n"+"Pour la défense : "+character.getDefensiveEquipement());
        System.out.println("------------- FIN DE L'APERCU -------------\n");
        System.out.print("Taper 1 = Fermer aperçu et continuer / Taper 0 = Quitter : ");
        return scanner.nextInt();
    }

    //Commençer l'aventure -> intro + récap
    public void startGame(Player player){
        System.out.println("\n*************** ENTREE DANS LE DONJON ********************");
        System.out.println("Dans les profondeurs d’un royaume oublié, des héros se lèvent pour affronter mystères et dangers.");
        System.out.println ("Le destin du donjon repose entre les mains de ceux qui oseront y entrer.");
        System.out.println ("***********************************************************\n");
        System.out.println("=======> "+"Vous êtes : "+"Le "+player.getCharacter().getType()+" "
                +player.getCharacter().getName() +" (Joueur "+player.getPlayerNumber()+")"+" <=======");
        System.out.println ("===> **** VOTRE MISSION **** <===");
        System.out.println ("Vous devez libérer le donjon de l'emprise du mal!");
        System.out.println ("********************** BONNE CHANCE *********************\n");
    }

    // Affiche le score du dé + la position joueur
    public void displayPosition(int diceResult, int position){
        System.out.println("Vous avez fait : "+diceResult);
        System.out.println("Vous êtes sur la case : "+position);
    }

    public int askRollDice(){
        System.out.println("==> Taper 1 = Lancer le dé / Taper 2 = Aperçu du personnage (Taper 0 = Quitter) : ");
        return scanner.nextInt();
    }

    // ******** Les interactions plateau ***********
    public int chooseInteract(String message){
        System.out.print (message);
        return scanner.nextInt();
    }

    // ********** Pour la fin de la partie **********
    public int looseGame(){
        System.out.println(" \n******************************************** ");
        System.out.println("===> Vous avez été vaincu !! YOU LOOSE !!!! <===");
        System.out.println ("****************** GAME OVER ******************");
        System.out.print("Taper 1 = Recommencer une partie / Taper 0 = Quitter : ");
        return scanner.nextInt();
    }
    public int winGame(){
        System.out.println("\n**********************************************");
        System.out.println("===> Vous avez gagné !! le Donjon est libéré! <===");
        System.out.println ("****************** CONGRATS ********************");
        System.out.print("Taper 1 = Recommencer une partie / Taper 0 = Quitter : ");
        return scanner.nextInt();
    }



    //scanner.close(); -> Pour fermer le clavier
}
