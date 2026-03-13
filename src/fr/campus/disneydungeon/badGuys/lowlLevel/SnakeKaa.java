package fr.campus.disneydungeon.badGuys.lowlLevel;

import fr.campus.disneydungeon.badGuys.Enemy;

public class SnakeKaa extends Enemy {

    // ---------- Constructeur --------
    public SnakeKaa(){
        super("Kaa","Serpent hypnotique capable d’endormir ses adversaires avant de frapper",
                "Créature",30, 8,7);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }

}
