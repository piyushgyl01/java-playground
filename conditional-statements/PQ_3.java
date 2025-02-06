import java.util.Scanner;

public class PQ_3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number from 1 to 7:");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("It's Monday");
                    break;
                case 2:
                    System.out.println("It's Tuesday");
                    break;
                case 3:
                    System.out.println("It's Wednesday");
                    break;
                case 4:
                    System.out.println("It's Thursday");
                    break;
                case 5:
                    System.out.println("It's Friday");
                    break;
                case 6:
                    System.out.println("It's Saturday");
                    break;
                case 7:
                    System.out.println("It's Sunday");
                    break;
            
                default:
                    break;
            }
        }
    }
}