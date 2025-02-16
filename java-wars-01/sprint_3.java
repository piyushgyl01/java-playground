public class sprint_3 {
    public static void main(String[] args) {
        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow + 1; currCol++) {
                System.out.print(currCol);
            }
            System.out.println();
        }

        //2 
        for (int currRow = 1; currRow <= 10; currRow++) {
            for (int currCol = 1; currCol <= 10 - currRow + 1; currCol++) {
                System.out.print(currCol);
            }
            System.out.println();
        }

        //3
        for (int currRow = 1; currRow <= 100; currRow++) {
            for (int currCol = 1; currCol <= 100 - currRow + 1; currCol++) {
                System.out.print(currCol);
            }
            System.out.println();
        }

        //4
        for (int currRow = 1; currRow <= 3; currRow++) {
            for (int currCol = 1; currCol <= 3 - currRow + 1; currCol++) {
                System.out.print(currCol);
            }
            System.out.println();
        }

        for (int currRow = 1; currRow <= 4; currRow++) {
            for (int currCol  = 1; currCol <= 4 -currRow + 1; currCol++) {
                System.out.print(currCol);
            }
            System.out.println();
        }
    }
}
