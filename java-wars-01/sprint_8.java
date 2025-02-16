public class sprint_8 {
    public static void main(String[] args) {
        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 5; currCol++) {
                if (currCol == 1 || currRow == 1 || currRow == 5 || currCol == 5) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //2
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 5; currCol++) {
                if (currCol == 1 || currRow == 1 || currRow == 5 || currCol == 5) {
                    System.out.print("P");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //3
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print("null");
            }
            for (int currCol = 1; currCol <= 5; currCol++) {
                if (currCol == 1 || currRow == 1 || currRow == 5 || currCol == 5) {
                    System.out.print("hey");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //4
        for (int currRow = 1; currRow <= 4; currRow++) {
            for (int currCol = 1; currCol <= 4 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 4; currCol++) {
                if (currCol == 1 || currRow == 1 || currCol == 4 || currRow == 4) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //5
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            } 
            for (int currCol = 1; currCol <= 5; currCol++) {
                if (currCol == 1 || currRow == 1 || currCol == 5 || currRow == 5) {
                    System.out.print("/");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
