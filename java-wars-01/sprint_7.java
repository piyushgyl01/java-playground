public class sprint_7 {
    public static void main(String[] args) {
        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 5; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 5; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 5; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //4
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <=  5; currCol++) {
                System.out.print("I");
            }
            System.out.println();
        }

        for (int currRow = 1; currRow <= 50; currRow++) {
            for (int currCol = 1; currCol <= 50 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= 50; currCol++) {
                System.out.print("(");
            }
            System.out.println(currRow);
        }
    }
}
