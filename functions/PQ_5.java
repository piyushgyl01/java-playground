package functions;

public class PQ_5 {

    public static void invertedRotatedHalfPyramid(int totalRows) {
        //row
        for (int currRow = 1; currRow <= totalRows; currRow++) {
            //spaces on curr row
            for (int currCol = 1; currCol <= totalRows - currRow; currCol++) {
                System.out.print(" ");
            }
            //stars on curr row
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int totalRows = 50;

        invertedRotatedHalfPyramid(totalRows);
    }
    
}