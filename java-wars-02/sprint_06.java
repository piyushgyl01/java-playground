public class sprint_06 {
    public static void printSubArr_01(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }
    public static void printSubArr_02(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printSubArr_03(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(k);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printSubArr_04(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printSubArr_05(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + ", " + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printPairs_06(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + ", " + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printPairs_07(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + ", " + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printPairs_08(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + ", " + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printPairs_09(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + ", " + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }

    public static void printPairs_10(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + ", " + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays: " + ts);
    }
    public static void main(String[] args) {
        int[] array1 = {12, 23, 34, 45, 56, 67, 78, 89, 90, 99};
        printSubArr_01(array1);

        int[] array2 = {-45, -23, 0, 12, 34, 67, 89, 120};
        printSubArr_02(array2);

        int[] array3 = {11, 22, 33, 44, 55, 66, 67, 77, 88, 99, 110, 121};
        printSubArr_03(array3);

        int[] array4 = {65, 66, 67, 68, 69, 70};
        printSubArr_04(array4);

        int[] array5 = {10, 30, 50, 67, 90, 120, 150};
        printSubArr_05(array5);

        printPairs_06(array5);
        printPairs_07(array5);
        printPairs_08(array5);
        printPairs_09(array4);
        printPairs_10(array3);
    }    
}
