package GFG.Questions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        Decide if input number is :
            a. positive even
            b. positive odd
            c. negative even
            d. negative odd
            e. zero

        */

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            System.out.print("Positive ");
            if (n%2==0){
                System.out.println("Even \n");
            }else {
                System.out.println("Odd \n");
            }
        } else if (n<0) {
            System.out.print("Negative ");
            if (n%2==0)
                System.out.print("Even \n");
            else
                System.out.print("Odd \n");
        }
        else {
            System.out.println("Zero");
        }
    }
}
