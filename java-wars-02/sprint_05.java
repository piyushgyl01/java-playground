public class sprint_05 {
    public static void printParis_01(int numbers[]) {
        int tp = 0;
        int tpByFormula = numbers.length * (numbers.length - 1) / 2; 

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + " | ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp + tpByFormula);
    }

    public static void printParis_02(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + " | ");
            }
            System.out.println();
        }
    }

    public static void printParis_03(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(" | " + numbers[i] + " | " + numbers[j] + " | " + " | ");
            }
            System.out.println();
        }
    }

    public static void printParis_04(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void printParis_05(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void printPairs_06(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + "| ");
            }
            System.out.println();
        }
    }

    public static void printPairs_07(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + "| ");
            }
            System.out.println();
        }
    }

    public static void printPairs_08(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + "| ");
            }
            System.out.println();
        }
    }

    public static void printPairs_09(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + "| ");
            }
            System.out.println();
        }
    }

    public static void printPairs_10(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print(numbers[i] + ", " + numbers[j] + "| ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] array1 = {12, 23, 34, 45, 56, 67, 78, 89, 90, 99};
        printParis_01(array1);

        int[] array2 = {-45, -23, 0, 12, 34, 67, 89, 120};
        printParis_02(array2);

        int[] array3 = {11, 22, 33, 44, 55, 66, 67, 77, 88, 99, 110, 121};
        printParis_03(array3);

        int[] array4 = {65, 66, 67, 68, 69, 70};
        printParis_04(array4);

        int[] array5 = {10, 30, 50, 67, 90, 120, 150};
        printParis_05(array5);

        printPairs_06(array5);

        printPairs_07(array5);

        System.out.println("eheheh");
        printPairs_08(array5);

        printPairs_09(array5);

        printPairs_10(array5);
    }    
}
