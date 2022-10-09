package GFG.Questions;

import java.util.Scanner;

public class Question2 {
    /* write a program to 5 pair of integers from user.
    for every pair (x,y) it should print (x/y) if y is not 0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            int x = sc.nextInt();
            System.out.print(x+" ");
            int y =sc.nextInt();
            System.out.print(y+" ");
            if (y==0)
                continue;
            System.out.print("Ans = "+x/y);
        }
    }
}
