package Enemy.Angel;

public class Seraphim {

    public static int defens;

    static {
        defens = 400;
    }

    public int health = 150;
    public int str = 250;

    public Seraphim(int a, int b) {
        health = a;
        str = b;
    }

    public Seraphim() {
    }

    public static void main(String[] args) {
        Seraphim s1 = new Seraphim();
        System.out.println(s1.health);
        System.out.println(s1.str);
    }

    public void show() {
        System.out.println("Меня зовут Серфим, у меня силы: " + str + " А жизни: " + health);
    }
}
