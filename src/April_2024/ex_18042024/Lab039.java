package April_2024.ex_18042024;

public class Lab039 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); // (10){11}+{11}(12)----10+12=22
        System.out.println(++a + ++a); // (13)+{13}(14)--------13+14=27
        System.out.println(a++ + ++a); // (14){15}+{15}(16)----14+16=30
        System.out.println(++a + ++a); // (17)+{17}(18)--------17+18=35
    }
}
