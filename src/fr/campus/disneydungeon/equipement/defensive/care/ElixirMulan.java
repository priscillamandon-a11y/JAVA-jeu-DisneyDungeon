package fr.campus.disneydungeon.equipement.defensive.care;

import fr.campus.disneydungeon.equipement.defensive.DefensiveEquipement;

public class ElixirMulan extends DefensiveEquipement {

    // --------- Constructeur ----------
    public ElixirMulan(){
        super("Elixir Mulan",20,"Care");
    }

    @Override
    public String toString() {
        return getName() +" / "+": +"+ getDefenseLevel()+" PV" +" / "+"Type :" + getType();

    }
}
