package model.badGuys;

import model.player.Player;

public abstract class Enemy {

    // Variables d'instance (ATTRIBUTS)
    private String name;
    private String description;
    private String type;
    private int lifeLevel;
    private int attackPower;
    private int defense;

// --------- Constructeur ---------------
    public Enemy (String name, String description, String type, int lifeLevel, int attackPower, int defense){
        this.name = name;
        this.description = description;
        this.type = type;
        this.lifeLevel = lifeLevel;
        this.attackPower = attackPower;
        this.defense = defense;
    }
// -------- les GETTERS ------------------
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }

// ---------- les SETTERS ------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

// --------------- Affichage des ennemis -------------------
    @Override
    public String toString() {
        return ">>>>>>>> ATTENTION <<<<<<<<\n>>>>>> Vous êtes attaqué!! <<<<<<\n"
                + "\n===> " + getName() + " <===" + "\n"
                + "Sa catégorie : " + getType() + "\n"
                + "Description : " + getDescription() + "\n"
                + "Niveau de vie : " + getLifeLevel() + "\n"
                + "Force d'attaque : " + getAttackPower() + "\n"
                + "Défense : " + getDefense() + "\n"
                + ">>>>>>>> Que souhaitez vous faire ? <<<<<<<<\n";
    }

}
