package loops;

import java.util.*;

public class PQ_2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
                
            int factorial = 1;

            System.out.println("Enter any positive number: ");
            num = sc.nextInt();

            for ( int i = 1; i <= num; i++) {
                factorial *= i;
                
            };

            System.out.println("Factorial: " + factorial);
        }
    }
}