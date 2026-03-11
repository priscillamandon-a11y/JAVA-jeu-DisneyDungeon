package model.gameElements.cases;

import model.badGuys.Enemy;
import model.player.Player;

public class EnemyCell extends Cell {
    // ----- Variables -----
    private Enemy enemy;

    // ------ constructeur ------
    public EnemyCell(Enemy enemy){
        this.enemy = enemy;
    }

    // ------ Metodes ------

    public Enemy getEnemy(Enemy enemy) {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override // methode pour identifier le type de case (vide ou pas)
    public String getType() {
        return "enemy";
    }

    @Override
    public String toString() {
        return enemy.toString();
    }

}
