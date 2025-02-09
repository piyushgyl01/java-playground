package functions;

public class PQ_9 {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int currRow = 1; currRow <= totalRows; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(totalRows - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int currRow = totalRows; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(totalRows - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}