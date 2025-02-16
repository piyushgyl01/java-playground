public class sprint_4 {
    public static void main(String[] args) {
        int counter = 1;

        //1
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        //2
        for (int currRow = 1; currRow <= 5; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        //3
        for (int currRow = 1; currRow <= 6; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        //4
        for (int currRow = 1; currRow <= 7; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        //5
        for (int currRow = 1; currRow <= 10000; currRow++) {
            for (int currCol = 1; currCol <= currRow; currCol++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }    
}
