package fr.campus.disneydungeon.board.cases;

import fr.campus.disneydungeon.equipement.offensive.OffensiveEquipement;

/**
 * Case contenant une arme que le joueur peut récupérer.
 */
public class WeaponCell extends Cell {

    // -------- Variables -------
    private OffensiveEquipement offensiveEquipement;

    /**
     * Crée une case arme avec l'équipement donné.
     *
     * @param offensiveEquipement arme présente sur la case
     */
    // -------- Constructeur -------
    public WeaponCell(int index, OffensiveEquipement offensiveEquipement){
        super(index);
        this.offensiveEquipement = offensiveEquipement;
    }

    // -------- Methodes ----------

    /**
     * @return l'équipement offensif contenu dans la case
     */
    public OffensiveEquipement getOffensiveEquipement() {
        return offensiveEquipement;
    }

    /**
     * Change l'arme contenue dans la case.
     *
     * @param offensiveEquipement nouvelle arme
     */

    /**
     * {@inheritDoc}
     */
    @Override // methode pour identifier le type de case (vide ou pas)
    public String getType() {
        return "weapon";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "\n------- Vous trouvez une arme  -------\n"
                + offensiveEquipement.toString();
    }
    @Override
    public String interact() {
        return "Arme : " + getOffensiveEquipement().getName();
    }
}
