public class sprint_5 {
    public static void main(String[] args) {
        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                if ((currCol + 2) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    
        //2
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                if ((currCol + currRow) % 2 == 0) {
                    System.out.print(2);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        //3
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                if ((currCol + 1) % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //4 
        // for (int currRow = 1; currRow <= 100; currRow++) {
        //     for (int currCol = 1; currCol <= currRow; currCol++) {
        //         if ((currCol + currRow) % 2 == 0) {
        //             System.out.print("ehe");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //5
        for (int currRow = 1; currRow <= 6; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                if ((currCol + currRow) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
