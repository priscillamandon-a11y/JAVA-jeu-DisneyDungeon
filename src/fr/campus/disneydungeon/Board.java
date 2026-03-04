package fr.campus.disneydungeon;

public class Board {
    //-------- Variables d'instance (attributs) --------
    private int size;


    //-------- Constructeur --------
    public Board (int size){
        this.size = size;
    }

    //-------- Methodes ---------

    // GET -> Lire les attributs privés
    public int getSize() {
        return size;
    }

}
