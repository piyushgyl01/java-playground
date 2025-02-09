package functions;

public class PQ_10 {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int currRow = 1; currRow <= totalRows; currRow++) {
            for (int currCol = 1; currCol <= totalRows - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= totalRows; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}