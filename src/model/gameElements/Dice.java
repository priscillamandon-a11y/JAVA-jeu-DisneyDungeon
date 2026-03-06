package model.gameElements;

public class Dice {
    //-------- Variables d'instance (attributs) --------
    private int face;

    //-------- Constructeur --------
    public Dice (int face){
        this.face = face;
    }

    //-------- Methodes --------

    public int rollOfDice (){
        return (int)(Math.random()* face) + 1; // je demande d'abord qu'il me rende un entier avec (int) ensuite je demande un nombre aleatoire entre 1 et 6 puis le +1 pour bien inclure le 6
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return "Vous jouez avec un dé à "+face+" faces";
    }
}
