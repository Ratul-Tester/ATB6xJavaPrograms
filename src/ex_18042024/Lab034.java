package ex_18042024;

public class Lab034 {
    public static void main(String[] args) {
        // Widening:- Process of conversion from lower to higher type, and its safe conversion...
        byte a = 10;
        int b = a; // Widening and Valid Implicit Casting
        int c = (int)a; // Widening with Explicit Casting
        System.out.println(b);
        System.out.println(c);
    }
}
