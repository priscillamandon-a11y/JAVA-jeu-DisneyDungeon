package fr.campus.disneydungeon;

public class Board {
    //-------- Variables d'instance (attributs) --------
    private int size = 64;


    //-------- Constructeur --------
    public Board (int size){
        this.size = 64;
    }

    //-------- Methodes ---------

    // GET -> Lire les attributs privés
    public int getSize() {
        return size;
    }

    // SET -> Modifier les valeurs des attributs privés
    public void setSize(int size) {
        this.size = size;
    }
}
