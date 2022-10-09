package GFG.Questions;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Method 1
        int ans_1 = Math.max(a,b);
        int ans  = Math.max(ans_1,c);
        System.out.println(ans);

        //Method 2
        if (a>=b && a>=c){
            System.out.println(a);
        } else if (b>=a && b>=c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
