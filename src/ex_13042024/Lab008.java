package ex_13042024;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        // Multiplication Table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the multiplication table");
        int x = sc.nextInt();
        int y;
        for (y=1; y<=10; y++) {
            System.out.print(x +"x"+ y +"="+x * y +"\t");
        }
    }

}
