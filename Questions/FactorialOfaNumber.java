package GFG.Questions;

import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //5
        int i = 1; //1, 5, 20,
        while(n>0){ //5>0 true, 4>0 true,
            i = i*n; //1*5, 5*4,
            n--; // 5-1 = 4, 4-1 = 3,
        }
        System.out.println("Factorial of a is : "+i);


        // Factorial using For-Loop
        int input = sc.nextInt();
        int x;
        for (x=1; input>0; input--){
            x = x*input;
        }
        System.out.println(x);
    }
}
