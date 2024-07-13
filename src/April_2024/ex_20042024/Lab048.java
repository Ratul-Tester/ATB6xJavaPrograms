package April_2024.ex_20042024;

public class Lab048 {
    public static void main(String[] args) {
        String name = "Ratul";
        String name1 = "Ratul";
        String name2 = new String("Ratul");
        System.out.println(name==name1); // True
        System.out.println(name==name2); // False
        System.out.println(name.equals(name1));
        System.out.println(name1.equals(name2));
    }
}
