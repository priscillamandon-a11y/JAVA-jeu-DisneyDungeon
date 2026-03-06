package model.character;

import model.equipement.defensive.DefensiveEquipement;
import model.equipement.offensive.OffensiveEquipement;

//On emploi extends pour lier cet enfant à son parent qui est Character
public class Warrior extends Character{

    // ---------- Constructeur --------
    public Warrior (String name, DefensiveEquipement defensiveEquipement, OffensiveEquipement offensiveEquipement){
        // super permet à l'enfant d'appeler le constructeur qui se trouve chez son parent
        super(name,"Guerrier",10,5,defensiveEquipement,offensiveEquipement);
    }

    @Override
    public String toString() {
        return "---- Choix du Guerrier ----"
                +"Son nom : " +getName()
                +"Points de Vie : "+getLife()
                +"Force de frappe : " +getAttack()
                +"Equipement Offensif : " +getOffensiveEquipement()
                +"Equipement Defensif : " +getDefensiveEquipement();
    }
}
