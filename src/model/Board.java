package model;

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

    // Set -> modifier les attributs privés
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Plateau de jeu avec "+size+" cases";
    }
}
