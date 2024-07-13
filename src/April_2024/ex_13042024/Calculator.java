package April_2024.ex_13042024;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a greater number to being:");
        int firstNumber = sc.nextInt();
        System.out.println("What do you want to perform ? \nfor example \n"+
                " Press 1 for Addition \n " +
                "Press 2 for Subtraction \n " +
                "Press 3 for Multiplication \n " +
                "Press 4 for Division \n " +
                "Press 5 for Modulus");
        int input = sc.nextInt();
        System.out.println("Enter the second number which is less / greater than the first number, to calculate:");
        int secondNumber = sc.nextInt();
        int Addition = firstNumber+secondNumber;
        int Subtraction = firstNumber-secondNumber;
        int Multiplication = firstNumber*secondNumber;
        int Division = firstNumber/secondNumber;
        int Modulus = firstNumber%secondNumber;
        if (input==1){
            System.out.println("Oo you have chosen for Addition");
            System.out.printf("And the Addition of numbers is %d",Addition);
        } else if (input==2){
            System.out.println("Oo you have chosen for Subtraction");
            System.out.printf("And the Subtraction of numbers is %d",Subtraction);
        } else if (input==3){
            System.out.println("Oo you have chosen for Multiplication");
            System.out.printf("And the Multiplication of numbers is %d",Multiplication);
        } else if (input==4){
            System.out.println("Oo you have chosen for Division");
            System.out.printf("And the Division of numbers is %d",Division);
        } else if (input==5){
            System.out.println("Oo you have chosen for Modulus");
            System.out.printf("And the Modulus of numbers is %d",Modulus);
        } else {
            System.out.println("You have chosen a wrong input, please try again");
        }

    }
}
