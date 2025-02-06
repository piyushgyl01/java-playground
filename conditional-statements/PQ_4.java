import java.util.Scanner;

public class PQ_4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input a year: ");
            int year = sc.nextInt();

            boolean divisibleByFour = (year % 4) == 0;
            boolean notDivisibleBy100 = (year % 100) != 0;
            boolean divisibleBy100And400 = ((year % 100 == 0) && (year % 400 == 0));

            if (divisibleByFour && (notDivisibleBy100 || divisibleBy100And400)) {
                System.out.println(year +  " Its a leap year");
            } else {
                System.out.println(year + " It's not a leap year");                
            }
        }
    }
}