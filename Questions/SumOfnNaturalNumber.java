package GFG.Questions;

public class SumOfnNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Result using Naive Way : "+sum(4));
        System.out.println("Result using Efficient Way :"+getSum(4));
    }

    //Efficient Way to solve this problem
    public static int getSum (int n){
        return n*(n+1)/2;
    }

    //Naive Way to solve this problem
    public static int sum(int n){
        int result = 0;
        for (int i=1; i<=n; i++){
            result = result+i;
        }
        return result;

    }

}
