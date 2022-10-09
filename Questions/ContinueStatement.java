package GFG.Questions;

public class ContinueStatement {
    public static void main(String[] args) {

        //Example of continue using for loop
        for (int i=0; i<5; i++){
            if (i==3)
                continue;
            //System.out.println(i);
        }

        System.out.println();

        // Example of continue with do while loop

        int i = 0;
        while(i<3) {
            i++;
          //  System.out.println("Before " + i);
            if (i == 2)
                continue;
            //System.out.println("After" + i);

        }
        System.out.println();


        //Example of continue using while loop
        int j = 0;
        while(j<3){ //0 1 2 3
            System.out.println("Before "+j); //0 1 2 3
            if (j==2)
                continue;
                System.out.println("After " + j); //0 1 3
                j++; //1 2 3

        }

    }
}
