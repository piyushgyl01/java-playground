package functions;

public class PQ_4 {
    public static void hardCodedInvertedAndRotated(int totalRows, int totalCols) {
        for (int row = 1; row <= totalRows; row ++) {
            for (int col = 1; col <= totalCols; col++) {
                if (row == totalRows || col == totalCols || (row == 3 && (col == 3 || col == 4)) || (row == 2 && col == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int totalRows = 4;
        int totalCols = 5;
            
        hardCodedInvertedAndRotated(totalRows, totalCols);
    }
    
}