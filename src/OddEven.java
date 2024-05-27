import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it's ODD or EVEN?:");
        int a = sc.nextInt();
        int check = a%2;
        if(check == 0){
            System.out.printf("%d is a even number", a);
        }
        else{
            System.out.printf("%d is a odd number", a);
        }
    }
}
