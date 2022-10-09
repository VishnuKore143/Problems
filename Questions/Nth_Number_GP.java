package GFG.Questions;

import java.util.Scanner;

public class Nth_Number_GP {

    public static int Nth_term(int firstTerm, int ratio, int nthNumber){
        int n = firstTerm*(int)(Math.pow(ratio,nthNumber-1));
        return n;
    }

    public static void main(String[] args) {
        //Geometric progression
        Scanner sc = new Scanner(System.in);
        int firstTerm = sc.nextInt();
        int ratio = sc.nextInt();
        int nthNumber = sc.nextInt();

    }

}
