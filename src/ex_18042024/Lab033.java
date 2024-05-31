package ex_18042024;

public class Lab033 {
    public static void main(String[] args) {
        float fees = 100f;
        float GST = 18.45f;
        double total = (int)(fees+GST); //Explicit casting
        System.out.println(total);
    }
}
