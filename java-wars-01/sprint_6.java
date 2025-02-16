public class sprint_6 {
    public static void main(String[] args) {
        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(5 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int currRow = 5; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(5 - currRow); currCol++) {
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
            for (int currCol = 1; currCol <= 2 * (5 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int currRow = 5; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2 * (5 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3
        for (int currRow = 1; currRow <= 10; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(10 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int currRow = 10; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(10 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //4
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(5 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int currRow = 5; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(5 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //5
        for (int currRow = 1; currRow <= 24; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(24 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int currRow = 24; currRow >= 1; currRow--) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            for (int currCol = 1; currCol <= 2*(24 - currRow); currCol++) {
                System.out.print(" ");
            }
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
