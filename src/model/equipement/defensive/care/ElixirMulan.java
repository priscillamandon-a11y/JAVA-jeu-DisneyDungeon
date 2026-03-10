package model.equipement.defensive.care;

import model.equipement.defensive.DefensiveEquipement;

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
