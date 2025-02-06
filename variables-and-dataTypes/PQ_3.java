import java.util.*;

public class PQ_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float pencil = sc.nextFloat();
            float pen = sc.nextFloat();
            float eraser = sc.nextFloat();

            float total = pencil + pen + eraser;
            System.out.println("Total bill is: " + total);

            float newTotal = total + (total * 0.18f);
            System.out.println("Total bill with 18% GST is: " + newTotal);
        }
    }
}