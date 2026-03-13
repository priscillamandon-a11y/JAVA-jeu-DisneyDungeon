package fr.campus.disneydungeon.character;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;
import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

/**
 * Classe concrète représentant un guerrier.
 * Hérite de {@link Character} avec des statistiques prédéfinies.
 */
//On emploi extends pour lier cet enfant à son parent qui est Character
public class Warrior extends Character{

    /**
     * Crée un guerrier avec le nom et les équipements fournis.
     *
     * @param name nom du guerrier
     * @param defensiveEquipement équipement défensif
     * @param offensiveEquipement équipement offensif
     */
    // ---------- Constructeur --------
    public Warrior (String name, DefensiveEquipement defensiveEquipement, OffensiveEquipement offensiveEquipement){
        // super permet à l'enfant d'appeler le constructeur qui se trouve chez son parent
        super(name,"Guerrier",10,5,defensiveEquipement,offensiveEquipement);
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
