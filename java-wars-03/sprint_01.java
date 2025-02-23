public class sprint_01 {
    public static void maxSubArrSum_01(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void maxSubArrSum_02(int numbers[]) {
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0; 
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void maxSubArrSum_03(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] array1 = {12, 23, 34, 45, 56, 67, 78, 89, 90, 99};
        maxSubArrSum_01(array1);

        int[] array2 = {-45, -23, 0, 12, 34, 67, 89, 120};
        maxSubArrSum_02(array2);

        int[] array3 = {11, 22, 33, 44, 55, 66, 67, 77, 88, 99, 110, 121};
        maxSubArrSum_03(array3);
    }
}