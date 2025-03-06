public class sprint_01 {
    public static void bubbleSort_01(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort_02(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort_03(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort_04(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort_05(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void printArry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers1[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        bubbleSort_01(numbers1);
        printArry(numbers1);

        int numbers2[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        bubbleSort_02(numbers2);
        printArry(numbers2);

        int numbers3[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        bubbleSort_03(numbers3);
        printArry(numbers3);

        int numbers4[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        bubbleSort_04(numbers4);
        printArry(numbers4);

        int numbers5[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        bubbleSort_05(numbers5);
        printArry(numbers5);
    }    
}
