package April_2024.ex_11042024;

public class Lab005 {
    public static void main(String[] args) {
        int age =10;
        age = 40;
        System.out.println("Ratul"); // Ratul will be printed as it is within inverted commas
        System.out.println(1*0);     // 0 will be printed as it has no inverted commas, hence calculated
        System.out.println("1*1");   // 1*1 will be printed as it is within inverted commas
        System.out.println(2*2);     // 4 will be printed as it has no inverted commas, hence calculated
        System.out.println("2*2");   // 2*2 will be printed as it is within inverted commas
        System.out.println(age);     // 40 will be printed as it is reassigned
        age = age+1;                 // age value changed to 41, i.e., age = 40 + 1;
        System.out.println(age);     // 41 will be printed as it is incremented
        age = ++age;                 // age pre incremented so value changed to 42
        System.out.println(age);     // 42 will be printed as it is pre incremented
        age = age-1;                 // age value changed to 41, i.e., age = 42 - 1;
        System.out.println(age);     // 41 will be printed as it is decremented
    }
}
