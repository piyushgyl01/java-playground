package functions;

public class PQ_6 {

    public static void main(String[] args) {
        int totalRows = 5;

        for (int currRow = 1; currRow <= totalRows; currRow++) {
            for (int currCol = 1; currCol <= totalRows - currRow + 1; currCol++) {
                System.out.print(currCol);
            }
            System.out.println();
        }
    }
}