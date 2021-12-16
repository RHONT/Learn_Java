package The_Area_For_Backlite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        File f= new File("c:\\Abrams\\area.txt");
        Scanner sc;
        float sum=0;
        int count=0;
        int count_error=0;
        String[] str;
        int a=0;
        int b=0;
        String buffer_str;
        {
            try {
                sc = new Scanner(f);
                while (sc.hasNext()){
                    buffer_str=sc.next().trim();
//
                        str=buffer_str.split("[*х]");
                    try {
                        a=Integer.valueOf(str[0].trim());
                        b=Integer.valueOf(str[1].trim());
                        sum+=((a/1000f)*(b/1000f));
                        System.out.println(Arrays.toString(str));
                        count++;
                    }
                    catch (NumberFormatException e){
                        //e.printStackTrace();
                        str[0]="Ошибка";
                        str[1]="Ошибка";
                        System.out.println(Arrays.toString(str));
                        count_error++;
                    }

                }
                sc.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("Общая площать = " + sum);
                System.out.println("Всего бэклитов = " + count);
                System.out.println("Ошибок = " + count_error);

            }
        }

    }

}
