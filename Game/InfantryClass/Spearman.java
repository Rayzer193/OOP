package Game.InfantryClass;

/**
 * Копейщик
 */

 public class Spearman extends InfantryClass {

    public Spearman(String name) {
        super(name, 100, 100, 7, 60, 14 );
    }

    @Override
    public void step() {
        System.out.println("Копейщик атакует!");
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }


}