package GFG.Questions;

public class BreakStatement {
    public static void main(String[] args) {
        // Example 1
        int i;
        for (i=0; i<5; i++){
            if (i==3)
                break;
            System.out.println(i);
        } //O/P: 0 1 2

        System.out.println();

        //example 2

        int j;
        for (j=0; j<5; j++){
            if (j==3)
                break;
            System.out.println(j);
        }
        System.out.println(j); //O/P: 0 1 2 3

        System.out.println();

        //Example 3
        int k;
        for (k=0; k<5; k++){
            if (k==1)
                break;
            System.out.println(k);
        } //O/P: 0
    }
}
