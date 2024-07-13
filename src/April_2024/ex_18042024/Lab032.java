package April_2024.ex_18042024;

public class Lab032 {
    public static void main(String[] args) {
        int a = 300;
       // byte b = a; // This expression is not possible as Byte Range is not allowing
        // System.out.println(b);
        byte c = (byte)a; // Doing explicit casting, it is allowing.
        System.out.println(c);
    }
}
