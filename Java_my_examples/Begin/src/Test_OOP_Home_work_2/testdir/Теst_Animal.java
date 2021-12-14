package Test_OOP_Home_work_2.testdir;

import Test_OOP_Home_work_2.Dog;
import Test_OOP_Home_work_2.Pet;


public class Теst_Animal {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        p1.jump();
        Dog d1 = new Dog("Сатана");
        System.out.println(d1.paw + "  " + d1.eyes);


    }
}
