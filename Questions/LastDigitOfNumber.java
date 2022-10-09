package GFG.Questions;

import java.util.Scanner;

public class LastDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); //123
        int y =Math.abs(n); //123
        int ans  = y%10; //123 //ans 3
        System.out.println(ans); // 3
    }
}
