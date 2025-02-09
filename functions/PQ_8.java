package functions;

public class PQ_8 {

    public static void main(String[] args) {
        int totalRows = 5;

        for (int currRow = 1; currRow <= totalRows; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                if ((currCol + currRow) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}