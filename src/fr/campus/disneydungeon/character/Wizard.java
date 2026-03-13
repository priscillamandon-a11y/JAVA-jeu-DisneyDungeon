package fr.campus.disneydungeon.character;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;
import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

/**
 * Classe concrète représentant un magicien.
 */
//On emploi extends pour lier cet enfant à son parent qui est Character
public class Wizard extends Character{

    // ---------- Constructeur --------
    public Wizard (String name, DefensiveEquipement defensiveEquipement, OffensiveEquipement offensiveEquipement){
        // super permet à l'enfant d'appeler le constructeur qui se trouve chez son parent
        super(name,"Sorcier",5,8,defensiveEquipement,offensiveEquipement);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "\n---------------- Choix du "+getType()+" --------------------\n"
                +"=> Son nom : " +getName()+"\n"
                +"=> Points de Vie : "+getLife()+"\n"
                +"=> Force de frappe : " +getAttack()+"\n"
                +"Equipement Offensif : " +getOffensiveEquipement()+"\n"
                +"Equipement Defensif : " +getDefensiveEquipement();
    }

}