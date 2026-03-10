package model.gameElements;

import model.badGuys.lowlLevel.ProwlerOfTheRuins;
import model.equipement.defensive.Potion;
import model.equipement.offensive.Weapon;
import model.gameElements.cases.*;

import java.util.ArrayList;

public class Board {

    //-------- Variables d'instance (attributs) --------
    private int size;
    private ArrayList<Cell> cells;


    //-------- Constructeur --------
    public Board (int size){
        this.size = size;
        this.cells = new ArrayList<>();
        buildBoard(); // methode qui rempli mon tableau pour construire mon plateau
    }

    //-------- Methodes ---------

    // GET -> Lire les attributs privés
    public int getSize() {
        return size;
    }

    // Set -> modifier les attributs privés
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Plateau de jeu avec "+size+" cases";
    }

    // ********** Construction du plateau avec remplissage des cases ***********************
    private void buildBoard (){
        cells.add(new EmptyCell()); // case 1 (vide)
        cells.add(new EnemyCell(new ProwlerOfTheRuins())); // case 2 (ennemi)
        cells.add(new WeaponCell(new Weapon())); // case 3 (arme)
        cells.add(new PotionCell(new Potion())); // case 4 (potion)

        // Boucle pour completer le plateau jusqu'à la fin
        while(cells.size()< size){
            cells.add(new EmptyCell()); // compéte avec des cases vides
        }
    }
}
