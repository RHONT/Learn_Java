package Enemy.demon;

public class Diablo {

    public static int range = 800;
    int health = 150;
    int str = 250;

    public Diablo(int a, int b) {
        health = a;
        str = b;
    }

    public Diablo() {
    }

    public static void main(String[] args) {
        Diablo d1 = new Diablo();
        System.out.println(d1.health);
        System.out.println(d1.str);
        System.out.println(range);
    }

    public void show() {
        System.out.println("Меня зовут Диабло, у меня силы: " + str + " А жизни: " + health);
        System.out.println("Ярости во мне! на " + range);
    }
}
