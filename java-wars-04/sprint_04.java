public class sprint_04 {
    public static void countingSort_01(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void countingSort_02(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void countingSort_03(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void countingSort_04(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            System.out.println(largest);
        }

        int count[] = new int[largest + 1];
        System.out.println("Count: " + count);

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            System.out.println(count[arr[i]]++);
        }
        int j = 0;
        System.out.println(j);
        for (int i = 0; i < count.length; i++) {
            arr[j] = i;
            j++;
            count[i]--;
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers_01[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        countingSort_01(numbers_01);
        printArray(numbers_01);

        int numbers_02[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        countingSort_02(numbers_02);
        printArray(numbers_02);

        int numbers_03[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        countingSort_03(numbers_03);
        printArray(numbers_03);

        int numbers_04[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        countingSort_04(numbers_04);
    }
}
