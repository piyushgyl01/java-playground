
public class sprint_1 {
    public static void main(String[] args) {
        //Iteration-01
        // for (int row = 1; row <= 5; row++) {
        //     for (int col = 1; col <= 9; col++) {
        //         if (row == 1 || col == 1 || row == 5 || col == 9) {
        //             System.out.print("");
        //         } else {
        //             System.out.print("firefky");
        //         }
        //     }
        //     System.out.println();
        // }

        //02
        // for (int row = 1; row <= 3; row++) {
        //     for (int col = 1; col <= 3; col++) {
        //         if (row == 1 || col == 1 || col == 3 || row == 3) {
        //             System.out.print("heh");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //3
        // for (int row = 1; row <= 5; row ++) {
        //     for (int col = 1; col <= 5; col ++) {
        //         if (col == 3 || row == 3) {
        //             System.out.print("P");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //4
        // for (int row = 1; row <= 5; row++) {
        //     for (int col = 1; col <= 4; col++) {
        //         if ((col == 1 && (row == 5 || row == 1)) || (col == 4 && (row == 5 || row == 1))) {
        //             System.out.print(".");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //5
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if ((col == 1 && (row == 5 || row == 1)) || (col == 5 && (row == 5 || row == 1)) ) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
