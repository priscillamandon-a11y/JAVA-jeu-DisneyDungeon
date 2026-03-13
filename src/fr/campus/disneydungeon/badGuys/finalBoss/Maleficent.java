package fr.campus.disneydungeon.badGuys.finalBoss;

import fr.campus.disneydungeon.badGuys.Enemy;

public class Maleficent extends Enemy {

    // Constructeur
    public Maleficent(){
        super("Maléfique","Sorcière puissante, capable de se transformer en dragon géant",
                "Magie",150,40,30);
    }
    @Override
    public String toString() {
        return "\n------- Un ennemis est là -------\n"
                + "===> " + getName() + " <===" + "\n"
                + "Sa catégorie : " + getType() + "\n"
                + "Description : " + getDescription() + "\n"
                + "Niveau de vie : " + getLifeLevel() + "\n"
                + "Force d'attaque : " + getAttackPower() + "\n"
                + "Défense : " + getDefense() + "\n";
    }
}
