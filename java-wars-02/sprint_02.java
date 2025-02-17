public class sprint_02 {
    public static int getLargest_1(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }     
        System.out.println("Largest: " + largest);   
        System.out.println("Smallest: " + smallest);
        return largest;
    }

    public static int getLargest_2(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } 
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);   
        System.out.println("Smallest: " + smallest);
        return largest;
    }

    public static int getLargest_3(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);   
        System.out.println("Smallest: " + smallest);
        return largest;
    }

    public static int getLargest_4(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);   
        System.out.println("Smallest: " + smallest);
        return largest;
    }

    public static int getLargest_5(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);   
        System.out.println("Smallest: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,4,53,46, 7, 23,2};
        getLargest_1(numbers);

        int numbers1[] = {45, 12, 89, 34, 67, 23, 91, 15, 78, 56};
        getLargest_2(numbers1);
        
        int numbers2[] = {-13, 24, -45, 67, -89, 12, -34, 56};
        getLargest_3(numbers2);
        
        int numbers3[] = {234, 567, 789, 123, 456, 890};
        getLargest_4(numbers3);
        
        int numbers4[] = {3, 7, 2, 7, 9, 2, 5, 8, 3, 6, 4, 8};
        getLargest_5(numbers4);
    }
}