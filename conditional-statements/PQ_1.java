import java.util.Scanner;

public class PQ_1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            if (x > 0) {
                System.out.println("X is positive number");
            } else {
                System.out.println("X is negative number");
            }
        }
    }
}