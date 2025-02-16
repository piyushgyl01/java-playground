public class sprint_2 {

    public static void main(String[] args) {
        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= 5 - currRow; currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }            

        //3
        int init = 5;
        for (int currRow = 5; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                    System.out.print(init);
                    init--;
            }
            System.out.println();
        }

        // 4
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int space = 1; space <= currRow -1 ; space++) {
                System.out.print(" ");
            }

            for (int currCol = 1; currCol <= 5 - currRow + 1; currCol++) {
                    System.out.print("*");
                    
            }
            System.out.println();
        }

        //5
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int space = 1; space <= currRow - 1; space++) {
                System.out.print(" ");
            }

            for (int currCol = 1; currCol <= 5 - currRow + 1; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 ****
  ***
   **
    *


 */