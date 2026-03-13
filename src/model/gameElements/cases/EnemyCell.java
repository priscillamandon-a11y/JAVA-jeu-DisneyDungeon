package model.gameElements.cases;

import model.badGuys.Enemy;
import model.player.Player;

/**
 * Case qui contient un ennemi à combattre.
 */
public class EnemyCell extends Cell {
    // ----- Variables -----
    private Enemy enemy;

    // ------ constructeur ------
    /**
     * Initialise une case ennemie avec l'ennemi donné.
     *
     * @param enemy ennemi occupant la case
     */

    public EnemyCell(int index, Enemy enemy){
        super(index);
        this.enemy = enemy;
    }

    // ------ Metodes ------

    /**
     * Renvoie l'ennemi de la case.
     * @return l'ennemi stocké
     */
    @Override
    public Enemy getEnemy() {
        return enemy;
    }
    /**
     * Définit l'ennemi de la case.
     *
     * @param enemy nouvel ennemi
     */
    /**
     * {@inheritDoc}
     */
    @Override // methode pour identifier le type de case (vide ou pas)
    public String getType() {
        return "enemy";
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return enemy.toString();
    }
    @Override
    public String interact() {
        return " ";
    }

}
