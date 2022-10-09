package GFG.Questions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(); //123
        int count = 0;
        while(n>0){ //123>0 true  12>0 true 1>0 true  0>0 false
            n = n/10; //123/10  12/10 1/10 --
            count = count+1; // 1 time divided 2nd time divided 3rd time divided --
        }
        System.out.println(count); //Answer is 3
    }
}
