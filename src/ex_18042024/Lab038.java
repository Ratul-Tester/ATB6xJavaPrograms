package ex_18042024;

public class Lab038 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a); // Initial Value printed
        System.out.println(++a); // Pre incremented value printed, then value stored in variable
        System.out.println(a++); /* Incremented value will be printed first,
                                    then post incremented and value stored in variable*/
        System.out.println(a); // Post incremented value will be printed
    }
}
