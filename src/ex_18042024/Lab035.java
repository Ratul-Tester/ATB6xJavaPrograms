package ex_18042024;

public class Lab035 {
    public static void main(String[] args) {
        // Narrowing:- Process of conversion from higher to lower type...
        int a = 300;
        // byte b = a; // Implicit casting is invalid...
        byte b = (byte)a; // Narrowing with Explicit Casting...
        System.out.println(b);
    }
}
