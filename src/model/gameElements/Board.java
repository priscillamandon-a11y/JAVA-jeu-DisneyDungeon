package model.gameElements;

import model.badGuys.lowlLevel.ProwlerOfTheRuins;
import model.equipement.defensive.care.BiscuitSimba;
import model.equipement.offensive.weapon.SultanSword;
import model.gameElements.cases.*;

import java.util.ArrayList;

/**
 * Représente le plateau de jeu composé d'une liste de cases.
 * La taille et les cases sont configurées lors de la construction.
 */
public class Board {

    //-------- Variables d'instance (attributs) --------
    private int size;
    private ArrayList<Cell> cells;


    /**
     * Crée un plateau de la taille indiquée et initialise les cases.
     *
     * @param size nombre de cases sur le plateau
     */
    //-------- Constructeur --------
    public Board (int size){
        this.size = size;
        this.cells = new ArrayList<>();
        buildBoard(); // methode qui rempli mon tableau pour construire mon plateau
    }

    //-------- Methodes ---------

    /**
     * @return le nombre de cases du plateau
     */
    // GET -> Lire les attributs privés
    public int getSize() {
        return size;
    }

    /**
     * Modifie la taille du plateau.
     *
     * @param size nouvelle taille
     */
    // Set -> modifier les attributs privés
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Description textuelle du plateau pour le débogage.
     *
     * @return représentation du plateau
     */
    @Override
    public String toString() {
        return "Plateau de jeu avec "+size+" cases";
    }

    /**
     * Construit et remplit la liste de cases du plateau en respectant
     * l'ordre défini par le jeu.
     *
     * Ce méthode est appelée une fois lors de l'initialisation.
     */
    // ********** Construction du plateau avec remplissage des cases **************
    public void buildBoard (){
        cells.add(new EmptyCell()); // case 1 (vide)
        cells.add(new EnemyCell(new ProwlerOfTheRuins())); // case 2 (ennemi)
        cells.add(new WeaponCell(new SultanSword())); // case 3 (arme)
        cells.add(new PotionCell(new BiscuitSimba())); // case 4 (potion)

        // Boucle pour completer le plateau jusqu'à la fin
        while(cells.size()< size){
            cells.add(new EmptyCell()); // compéte avec des cases vides
        }
    }
    /**
     * Renvoie la case située à l'indice donné.
     *
     * @param index position de la case (0-based)
     * @return cellule correspondante
     */
    // methode pour renvoyer une case exacte du plateau
    public Cell getCell(int index){
        return cells.get(index); // prendre l'index de la case et renvoyer la Cell qui correspond
    }
}
