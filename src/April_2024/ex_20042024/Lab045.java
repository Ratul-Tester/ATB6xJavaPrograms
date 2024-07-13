package April_2024.ex_20042024;

public class Lab045 {
    public static void main(String[] args) {
        String s = "Ratul";
        String s1 = new String("Ratul");
        System.out.println(s);
        System.out.println(s1);
        Boolean result = (s==s1);
        System.out.println(result);
        System.out.println(s.equals(s1));
        System.out.println(s.contains("r"));
        System.out.println(s.contains("R"));
        System.out.println(s.contains("Pa"));
    }
}
