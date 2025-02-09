package functions;

public class PQ_11 {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int currRow = 1; currRow <= totalRows; currRow++) {
            for (int currCol = 1; currCol <= totalRows - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= totalRows; currCol++) {
                if (currCol == 1 || currRow == 1 || currRow == totalRows || currCol == totalRows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}