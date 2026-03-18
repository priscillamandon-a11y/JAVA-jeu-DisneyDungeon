package fr.campus.disneydungeon.game;

import fr.campus.disneydungeon.badGuys.Enemy;
import fr.campus.disneydungeon.board.cases.WeaponCell;
import fr.campus.disneydungeon.character.Character;
import fr.campus.disneydungeon.character.Warrior;
import fr.campus.disneydungeon.character.Wizard;
import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;
import fr.campus.disneydungeon.equipement.defensive.care.BiscuitSimba;
import fr.campus.disneydungeon.equipement.defensive.protect.BasicShield;
import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;
import fr.campus.disneydungeon.equipement.offensive.spell.BasicSpell;
import fr.campus.disneydungeon.equipement.offensive.weapon.BasicWeapon;
import fr.campus.disneydungeon.exceptions.OutOfBoardException;
import fr.campus.disneydungeon.board.Board;
import fr.campus.disneydungeon.board.Dice;
import fr.campus.disneydungeon.board.cases.Cell;
import fr.campus.disneydungeon.game.player.Player;


/**
 * Contrôleur principal du jeu. Gère l'interaction avec le joueur,
 * le plateau et la logique de déroulement de la partie.
 */
public class Game {
    // -------- Variables d'instances ----------
    private Menu menu;
    private Character character;
    private Board board;
    private Dice dice;
    private Player player;
    private OffensiveEquipement OffensiveEquipement;


    /**
     * Initialise les composants de base du jeu (menu, plateau, dé).
     */
    // -------- constructeur ------------------
    public Game (){
        //Creation des objets
        this.menu = new Menu();// permet l'utilisation dans toutes mes fonctions
        this.board = new Board(64);
        this.dice = new Dice(6);

    }

    // ------- Methodes/ fonctions ---------------

    /**
     * Affiche le menu d'introduction et redirige selon le choix :
     * création de personnage ou sortie.
     */
    // ******** Démarrage (Menu principal) *********
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

    /**
     * Procédure de création du personnage choisie par l'utilisateur.
     * Demande le type et le nom puis instancie {@link Warrior} ou
     * {@link Wizard}.
     */
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
            this.character = new Warrior(name, new BasicShield(),
                    new BasicWeapon());

        } else if (typeChoice == 2){
            this.character = new Wizard(name, new BiscuitSimba(),
                    new BasicSpell());

        } else {
            quitGame();
        }
        // Creation du numéro JR -> après le choix du personnage pour que je puisse l'utiliser dans mes autres methodes
        this.player = new Player(1,character);

        displayCharacter(); // j'appel la methode depuis la class Menu pour Afficher le personnage
    }

    /**
     * Affiche les caractéristiques du personnage courant puis propose
     * de démarrer la partie.
     */
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

    // ********* Demarrage de l'aventure **************
    public void startGame(){
        menu.startGame(player); // j'appelle mon intro de jeu
        startGameLoop();

    }

    /**
     * Boucle principale de la partie. Gère le déplacement, les interactions
     * sur les cases et les choix du joueur.
     */
    // boucle de jeu
    public void startGameLoop(){

        while (player.getPosition() < board.getSize()) { // je boucle tant que l'utilisateur n'est pas àla derniere case du plateau
            int choice = menu.askRollDice(); // j'initialise le choix utilisateur

            if(choice == 1){

                int diceResult = dice.rollOfDice(); // je recupere le resultat du dé
                int newPosition = player.getPosition() + diceResult; // je recupere la position du Joueur et la rajoute au dé
                // je mets une condition pour ne pas dépasser les 64 cases / J'utilise la classe Execption
                try{
                    if (newPosition > board.getSize()) {
                        throw new OutOfBoardException("Vous êtes sorti du plateau !");
                    }
                } catch (OutOfBoardException e){ // le  e  est une variable qui signifie erreur on l'utilise par convention dans l'utilisation des exceptions
                    System.out.println(e.getMessage());
                    newPosition = board.getSize();
                }
                player.setPosition(newPosition); // je modifie la position du joueur
                menu.displayPosition(diceResult, player.getPosition()); // j'affiche ou en est l'utilisateur

                Cell playerPosition = board.getCell(player.getPosition()); // j'identifie la case sur laquelle est le joueur
                playTurn(playerPosition);

            } else if (choice == 2){
                menu.previewCharacter(character);

            } else if(choice == 0){
                quitGame();
            } else {
                System.out.println("Saisie invalide");
                menu.displayCharacter(character);
            }
        }
        endOfGame();
    }

    /**
     * Traite l'interaction du joueur avec une case donnée.
     *
     * @param cell case sur laquelle le joueur se trouve
     */

    // ******* Interaction joueur avec les cases du plateau *********
    public void playTurn(Cell cell){

        switch (cell.getType()){ // mise en place de switch (plus lisible) pour afficher les cases

            case "enemy" :
                System.out.println (cell); // Affichage de la case
                boolean stayEnemyCell = true; // je lui demande de rester sur la case ennemy tant qu'on est dans la condition vrai

                while(stayEnemyCell) {
                    int choice = menu.chooseInteract("1 = Combattre / 2 = Fuir / 3 = Aperçu personnage (0 = Quitter) : ");

                    if (choice == 1) {
                        fight(cell.getEnemy());
                        stayEnemyCell = false; // je lui donne faux pour quitter la case après le combat
                    } else if (choice == 2) {
                        flee();
                        stayEnemyCell = false; // je lui donne faux pour quitter la case après la fuite
                    } else if (choice == 3) {
                        menu.previewCharacterStats(character); // j'affiche les stats du personnage sans quitter la case

                    } else if (choice == 0) {
                        quitGame();
                    } else {
                        System.out.println("Saisie invalide");
                        menu.displayCharacter(character);
                    }
                }
                    return;

            case "potion" :
                System.out.println (cell); // Affichage de la case
                boolean stayPotionCell = true; // je lui demande de rester sur la case ennemy tant qu'on est dans la condition vrai

                while(stayPotionCell) {
                    int choiceDefense = menu.chooseInteract("1 = Ramasser / 2 = laisser / 3 = Aperçu personnage (0 = Quitter) : ");

                    if (choiceDefense == 1) {
                        DefensiveEquipement newPotion = cell.getDefensiveEquipement(); // récupérer l'équipement défensif

                        // equiper le personnage
                        character.setDefensiveEquipement(newPotion);

                        System.out.println("\n====> Vous ramassez : " + newPotion.getName() + " <====");
                        System.out.println("Vous avez : " + newPotion.getDefenseLevel()+" PV");

                        stayPotionCell = false; // quitter la case

                    }else if (choiceDefense == 2){
                        stayPotionCell = false; // quitter la case

                    }else if (choiceDefense == 3){
                        menu.previewCharacterStats(character);

                    }else if (choiceDefense == 0) {
                        quitGame();

                    }else {
                        System.out.println("Saisie invalide");
                        menu.displayCharacter(character);
                    }
                }
                return;

            case "weapon" :
                System.out.println (cell); // Affichage de la case
                boolean stayWeaponCell = true; // je lui demande de rester sur la case ennemy tant qu'on est dans la condition vrai

                while(stayWeaponCell) {
                    int choiceWeapon = menu.chooseInteract("1 = S'équiper / 2 = laisser / 3 = Aperçu personnage (0 = Quitter) : ");

                    if (choiceWeapon == 1) {
                        OffensiveEquipement newWeapon = cell.getOffensiveEquipement(); // répuré l'arme de la case

                        // équiper le personnage :
                        character.setOffensiveEquipement(newWeapon);

                        System.out.println("\n====> Vous ramassez : " + newWeapon.getName() + " <====");
                        System.out.println("Niveau d'attaque : " + newWeapon.getAttackLevel());
                        stayWeaponCell = false; // quitter la case

                    }else if (choiceWeapon == 2){
                        System.out.println("Vous laissez l'arme et continuez votre chemin.");
                        stayWeaponCell = false; // quitter la case

                    }else if (choiceWeapon == 3){
                        menu.previewCharacterStats(character);

                    }else if (choiceWeapon == 0) {
                        quitGame();

                    }else {
                        System.out.println("Saisie invalide");
                        menu.displayCharacter(character);
                    }
                } return;

            case "empty" :
                System.out.println (cell); // Affichage de la case
                return;
        }
    }
    /**
     * Démarre un combat contre un ennemi.
     *
     * @param enemy ennemi à combattre
     */

    // --------------- COMBAT --------------------------------
    public void fight(Enemy enemy){
        System.out.println("\n>>>>>>>>>>>>> Le combat commence <<<<<<<<<<<<<<<");

        // tant que l'ennemi n'est pas mort ou le personnage n'est pas mort :
        while (character.getLife() > 0 && enemy.getLifeLevel()>0){
            int choice = menu.chooseInteract(">>>> 1 = Attaquer / 2 = Se protéger / 3 = Fuir (0 = Quitter) <<<<\n");

            //--------- ATTAQUE -----------
            if (choice == 1){
                // attaque du joueur
                int damagePlayer = character.getAttack()+ character.getOffensiveEquipement().getAttackLevel();
                int newPvEnemy = enemy.getLifeLevel() - damagePlayer;

                if(newPvEnemy < 0){ newPvEnemy=0;} // pour que les PV ennemi ne soient pas négatif

                enemy.setLifeLevel(newPvEnemy);
                System.out.println(">>> Vous avez touchez l'ennemi! <<<\n il lui reste : "+newPvEnemy+" PV");

                // vérifier si ennemi mort :
                if(newPvEnemy == 0){
                    System.out.println ("\n>>>>>>>>>>>> ET BAAAAAAAAAMMMMMMMM <<<<<<<<<<<<<<");
                    System.out.println ("****** >>>>> Vous avez vaincu l'ennemi <<<<<< ******\n");
                    return; // sort de la methode fight()
                     }

                // attaque de l'ennemi
                System.out.println("\n>>>>> "+enemy.getName()+" vous attaque <<<<<");

                int damageEnemi =  enemy.getAttackPower();
                if(damageEnemi<0){ damageEnemi = 0;} // pour que les degats ne soient pas en négatif

                int newPvPlayer = character.getLife() - damageEnemi;
                character.setLife(newPvPlayer);

                System.out.println("Il vous inflige : "+damageEnemi+" dégats\n"+"=> il vous reste : "+newPvPlayer+" PV");

                // Vérifier si joueur mort
                if (newPvPlayer <= 0){
                    menu.looseGame();
                    quitGame();
                    return; // sortir de la methode
                }

            //--------- Protection -----------
            } else if (choice == 2){
                System.out.println("\n====> Vous choisissez d'utiliser votre : "+character.getDefensiveEquipement().getName()+" <====");

                // degats reduits grace à la protection
                int reducedDamage = enemy.getAttackPower() - character.getDefensiveEquipement().getDefenseLevel();
                if (reducedDamage < 0) reducedDamage = 0; // éviter les dégâts en négatifs

                // mise à jour des PV joueur
                int newPvPlayer = character.getLife() - reducedDamage;
                character.setLife(newPvPlayer);
                System.out.println("Vous ne subissez que "+reducedDamage+" dégâts");
                System.out.println("Il vous reste "+newPvPlayer+" PV");

                // Vérifier si joueur mort
                if (newPvPlayer <= 0){
                    menu.looseGame();
                    quitGame();
                    return; // sortir de la methode
                }

            //--------- La fuite -----------
            } else if (choice == 3){
                flee();
                return; // sort de la methode fight()

            // --------- QUITTER -----------
            }else if (choice == 0){
                quitGame();
            }
        }
        Cell playerPosition = board.getCell(player.getPosition()); // j'identifie la case sur laquelle est le joueur
        playTurn(playerPosition);
    }


    // Fuir :
    public void flee(){
        System.out.println("\n========> Vous avez décidé de fuir le combat <========= ");
        // je fais reculer le joueur
        int newPosition = player.getPosition()-2;
        // je fais attention a ce qu'il ne puisse pas sortir du plateau
        if (newPosition < 0){
            newPosition = 0;
        }
        player.setPosition(newPosition);
        System.out.println("=> Vous repartez à la case : "+newPosition);

        // je lui enlève -2 PV :
        int newPvPlayer = character.getLife()-2;
        character.setLife(newPvPlayer);
        System.out.println("=> Vous perdez 2 PV. Il vous reste : "+newPvPlayer+" PV \n");

        startGameLoop();
    }


    /**
     * Termine le programme proprement en affichant le message de fin.
     */
    //********* Quitter le jeu *********
    public void quitGame(){
        this.menu.quitGame(); // affiches les messages enregistrés dans Menu
        System.exit(0); // permet d'arreter le systeme (le zero indique que l'arret s'est bien passé)
    }

    /**
     * Propose au joueur de recommencer ou de quitter lorsque le plateau
     * est terminé.
     */
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

