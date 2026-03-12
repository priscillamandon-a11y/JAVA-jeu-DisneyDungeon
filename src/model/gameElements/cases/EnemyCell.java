package model.gameElements.cases;

import model.badGuys.Enemy;
import model.player.Player;

/**
 * Case qui contient un ennemi à combattre.
 */
public class EnemyCell extends Cell {
    // ----- Variables -----
    private Enemy enemy;

    /**
     * Initialise une case ennemie avec l'ennemi donné.
     *
     * @param enemy ennemi occupant la case
     */
    // ------ constructeur ------
    public EnemyCell(Enemy enemy){
        this.enemy = enemy;
    }

    // ------ Metodes ------

    /**
     * Renvoie l'ennemi de la case.
     * @return l'ennemi stocké
     */
    public Enemy getEnemy() {
        return enemy;
    }

    /**
     * Définit l'ennemi de la case.
     *
     * @param enemy nouvel ennemi
     */
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

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

}
