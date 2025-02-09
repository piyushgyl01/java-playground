public class PQ_2 {

    public static void main(String[] args) {
        for (int line = 1; line <= 15; line ++) {
            for (int star = line; star <= (15 - line +1); star ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}