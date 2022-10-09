package GFG.Questions;

import java.util.Scanner;

public class Nth_Number_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arithmetic progression problem
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Nth_term(a,d,n));

    }

    public static int Nth_term(int a, int d, int n){
        int ans  = a+(n-1)*d;
        return ans;
    }
}
