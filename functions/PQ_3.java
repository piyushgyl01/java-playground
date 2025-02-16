package functions;
public class PQ_3 {
    public static void hollowRectangle(int totalRows, int totalCols) {
        for (int row = 1; row <= totalRows; row ++) {
            for (int col = 1; col <= totalCols; col++) {
                if (row == 1 || col == 1 || row == totalRows || col == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowRectangleIt2(int totalRows, int totalCols) {
        
    }
    public static void main(String[] args) {
        int totalRows = 4;
        int totalCols = 4;

       hollowRectangle(totalRows, totalCols);
    }
}