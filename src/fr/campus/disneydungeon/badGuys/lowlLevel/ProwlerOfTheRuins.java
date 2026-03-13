package fr.campus.disneydungeon.badGuys.lowlLevel;

import fr.campus.disneydungeon.badGuys.Enemy;

public class ProwlerOfTheRuins extends Enemy {

    // ---------- Constructeur --------
    public ProwlerOfTheRuins() {
        super("LE RÔDEUR DES RUINES", "Gros cafard, Prédateur furtif, utilisant l’environnement pour tendre des embuscades et affaiblir ses proies.",
                "Créature", 12, 5, 5);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
