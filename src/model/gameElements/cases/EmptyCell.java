package model.gameElements.cases;

import model.player.Player;

/**
 * Case vide sans événement particulier.
 */
public class EmptyCell extends Cell {
    // -------- Variables -------

    // -------- Constructeur -------
    public EmptyCell(int index) {
        super(index);
    }

    // -------- Methodes ----------

    @Override // methode pour identifier le type de case (vide ou pas)
    public String getType() {
        return "empty";
    }

    @Override
    public String toString() {
        return " --- Il n'y a personne, vous pouvez continuer votre chemin ---\n";
    }

    @Override
    public String interact() {
        return "Il n'y a rien";
    }

}
