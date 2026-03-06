package model.character;

import model.equipement.defensive.DefensiveEquipement;
import model.equipement.offensive.OffensiveEquipement;

//On emploi extends pour lier cet enfant à son parent qui est Character
public class Wizard extends Character{

    // ---------- Constructeur --------
    public Wizard (String name, DefensiveEquipement defensiveEquipement, OffensiveEquipement offensiveEquipement){
        // super permet à l'enfant d'appeler le constructeur qui se trouve chez son parent
        super(name,"Sorcier",5,8,defensiveEquipement,offensiveEquipement);
    }

    @Override
    public String toString() {
        return "---- Choix du Sorcier ----"
                +"Son nom : " +getName()
                +"Points de Vie : "+getLife()
                +"Force de frappe : " +getAttack()
                +"Equipement Offensif : " +getOffensiveEquipement()
                +"Equipement Defensif : " +getDefensiveEquipement();
    }
}