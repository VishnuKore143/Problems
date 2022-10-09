package GFG.Questions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year %4 ==0 && year%100 !=0){
            System.out.println(year+" Yes this is leap year");
        } else if (year %400 == 0) {
            System.out.println(year+" Yes this is leap year");
        }else {
            System.out.println(year+ " No this is not a leap year");
        }
    }
}
