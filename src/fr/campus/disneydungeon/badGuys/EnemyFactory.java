package fr.campus.disneydungeon.badGuys;

import fr.campus.disneydungeon.badGuys.lowlLevel.ProwlerOfTheRuins;
import fr.campus.disneydungeon.badGuys.lowlLevel.SnakeKaa;
import fr.campus.disneydungeon.badGuys.mediumLevel.ScarLion;
import fr.campus.disneydungeon.badGuys.highLevel.HadesGodOfTheUnderworld;
import fr.campus.disneydungeon.badGuys.finalBoss.Maleficent;

import java.util.Random;

public class EnemyFactory {

    private static final Random random = new Random();

    // ------------------ LOW LEVEL ENEMIES ------------------
    private static final Enemy[] lowLevelEnemies = {
            new ProwlerOfTheRuins(),
            new SnakeKaa()
    };

    // ------------------ MEDIUM LEVEL ENEMIES ------------------
    private static final Enemy[] mediumLevelEnemies = {
            new ScarLion()
    };

    // ------------------ HIGH LEVEL ENEMIES ------------------
    private static final Enemy[] highLevelEnemies = {
            new HadesGodOfTheUnderworld()
    };

    // ------------------ FINAL BOSS ------------------
    private static final Enemy[] finalBoss = {
            new Maleficent()
    };

    // ------------------ GET RANDOM ENEMY BY CATEGORY ------------------

    public static Enemy getRandomLowLevelEnemy() {
        return lowLevelEnemies[random.nextInt(lowLevelEnemies.length)];
    }

    public static Enemy getRandomMediumLevelEnemy() {
        return mediumLevelEnemies[random.nextInt(mediumLevelEnemies.length)];
    }

    public static Enemy getRandomHighLevelEnemy() {
        return highLevelEnemies[random.nextInt(highLevelEnemies.length)];
    }

    public static Enemy getFinalBoss() {
        return finalBoss[0]; // un seul boss final
    }
}
