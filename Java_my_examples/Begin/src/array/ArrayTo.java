package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTo {

    static ArrayList<String> abc(String[] a) {
        ArrayList<String> bufer = new ArrayList<>();
        ArrayList<String> getter = new ArrayList<>();
        String[] b;
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        Collections.addAll(bufer, a);
        System.out.println(bufer.toString());
        for (int i = 0; (i < (bufer.size() - 1)); i++) {
            if (((bufer.get(i)).equals(bufer.get(i + 1))) == false) {
                getter.add(bufer.get(i));
            }
        }
        bufer = (ArrayList) getter.clone();
        b = (String[]) bufer.clone();
        getter.clear();
        return bufer;

    }

    public static void main(String[] args) {
        ArrayList<String> bufer = new ArrayList<>();
        bufer.add("1");
        bufer.add("2");
        String[] b;
        //b=bufer.clone();

        b = (String[]) bufer.clone();
        System.out.println(abc(new String[]{"c", "dsaf", "adsfadf", "fasdf", "a", "a", "b", "b", "c"}));
        System.out.println(Arrays.toString(b));
    }
}
