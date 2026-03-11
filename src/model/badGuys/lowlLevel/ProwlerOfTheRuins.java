package model.badGuys.lowlLevel;

import model.badGuys.Enemy;

public class ProwlerOfTheRuins extends Enemy {

    // ---------- Constructeur --------
    public ProwlerOfTheRuins() {
        super("LE RÔDEUR DES RUINES", "Gros cafard, Prédateur furtif, utilisant l’environnement pour tendre des embuscades et affaiblir ses proies.",
                "Créature", 15, 4, 5);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
