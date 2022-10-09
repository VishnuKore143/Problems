package GFG.Questions;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an operation\n" +
                "1. Addition\n" +
                "2. subtraction\n" +
                "3. Multiplication");
        int operation = sc.nextInt();
        if (operation != 1 && operation != 2 && operation !=3){
            System.out.println("Invalid Input");
        }
        else {
            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();

        if (operation==1){
            System.out.print("Your answer is : "+a+b);
        } else if (operation == 2) {
            System.out.print( a-b);
        } else if (operation == 3) {
                System.out.print(a*b);
            }

        }
    }
}
