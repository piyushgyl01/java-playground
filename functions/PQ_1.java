package functions;

import java.util.Scanner;

public class PQ_1 {

    public static int sumAll(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();

            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Enter third number: ");
            int c = sc.nextInt();

            int sum = sumAll(a, b, c);
            System.out.println(sum);
        }
    }
    
}