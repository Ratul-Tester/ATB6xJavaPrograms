import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it's ODD or EVEN?:");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.printf("%d is a even number", num);
        }
        else{
            System.out.printf("%d is a odd number", num);
        }
    }
}
