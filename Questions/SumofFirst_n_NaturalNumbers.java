package GFG.Questions;

import java.util.Scanner;

public class SumofFirst_n_NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(n*(n+1)/2);
        }
    }
}
