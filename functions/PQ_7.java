package functions;

public class PQ_7 {

    public static void main(String[] args) {
        int totalRows = 5;
        int counter = 1;

        for (int currRow = 1; currRow <= totalRows; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}