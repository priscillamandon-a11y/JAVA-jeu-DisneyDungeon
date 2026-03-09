package model.gameElements.cases;

public abstract class Cell {
    // j'utilise abstract avec toString car c'est le modele de ma classe parent
    // et grace à abstract Celle reste mon modele et oblige les enfants a avoir leur toString qui affichera ce que la case est sensée faire
    @Override
    public abstract String toString();
}
