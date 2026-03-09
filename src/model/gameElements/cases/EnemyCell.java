package model.gameElements.cases;

import model.badGuys.Enemy;

public class EnemyCell extends Cell {
    // ----- Variables -----
    private Enemy enemy;

    // ------ constructeur ------
    public EnemyCell(Enemy enemy){
        this.enemy = enemy;
    }

    @Override
    public String toString() {
        return enemy.toString();
    }

}
