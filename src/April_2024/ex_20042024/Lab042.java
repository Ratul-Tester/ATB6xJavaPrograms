package April_2024.ex_20042024;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Lab042 {
    public static void main(String[] args) {
        String name = "Ratul Nandy";
        String name1 = new String("Ratul Nandy");
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println("-----------------");
        for (int i = 0; i < name.length(); i++) {
            Character nn = name.charAt(i);
            System.out.println(nn);
            //System.out.print(name.charAt(i));
        }
        System.out.println("-----------------");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println("-----------------");

        //System.out.println(name1.toLowerCase());


    }
}
