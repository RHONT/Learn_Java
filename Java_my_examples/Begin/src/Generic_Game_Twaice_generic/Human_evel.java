package Generic_Game_Twaice_generic;

public abstract class Human_evel {
    static int id = 0;
    String name_unit;
    int health;
    int defense;
    int weapon;

    @Override
    public String toString() {
        return "name: " + name_unit +
                ", health=" + health +
                ", defense=" + defense +
                ", weapon=" + weapon;
    }
}
