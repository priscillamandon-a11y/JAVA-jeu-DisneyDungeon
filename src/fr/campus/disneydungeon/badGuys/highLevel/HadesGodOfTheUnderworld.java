package fr.campus.disneydungeon.badGuys.highLevel;

import fr.campus.disneydungeon.badGuys.Enemy;

public class HadesGodOfTheUnderworld extends Enemy {

    // Constructeur
    public HadesGodOfTheUnderworld(){
        super("Hades","Dieu des Enfers au tempérament explosif contrôlant les flammes bleues.",
                "Magie",100,20,16);
    }
    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
