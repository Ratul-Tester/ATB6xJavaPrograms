package ex_18042024;

public class Lab031 {
    public static void main(String[] args) {
        byte b = 127;
        int a = b; // Int to byte conversion automatically by JVM & this is called Implicit Casting.
        int c = (int)b; // Assigning data type for conversion is called Explicit Casting.
        System.out.println(a);
        System.out.println(b);
    }
}
