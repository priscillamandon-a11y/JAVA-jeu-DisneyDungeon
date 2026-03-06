package model.equipement.defensive;

public class Shield extends DefensiveEquipement{

    // ---------- Constructeur ---------
    public Shield (String type,int defenselevel, String name){
        super("Protection",5,"Bouclier de départ");

    }
    @Override
    public String toString() {
        return getName() +" / "+"Niveau défense : "+ getDefenseLevel()+" / "+"Type :" + getType();

    }

}
