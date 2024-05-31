package ex_18042024;

public class Lab037 {
    public static void main(String[] args) {
        int a = 10;
        int pre = a++;
        System.out.println(pre); /* Initial value will be printed first,
                                    then post incremented value will be stored in variable...*/
        System.out.println(a); // Post incremented value will be printed...
    }
}
