package April_2024.ex_20042024;

public class Lab050 {
    public static void main(String[] args) {
        String s = "Ratul";
        char c = s.charAt(0);
        System.out.println(c);
        System.out.println(s.charAt(1));
        boolean b = s.contains("R");
        System.out.println(b);
        System.out.println(s.contains("R"));
        s.concat("Nandy");
        System.out.println(s);
        s=s.concat(" Nandy");
        System.out.println(s);
        System.out.println(s==s);
    }
}
