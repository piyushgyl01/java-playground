public class sprint_01 {
    public static int linearSearch_02(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch_03(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch_04(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch_05(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 40;

        // for (int i = 0; i <= numbers.length; i++) {
        //     if (numbers[i] == 10) {
        //         System.out.println("10 is at " + i + "th index");
        //     } else {
        //         System.out.println("No num found");
        //     }
        // }
        int index = linearSearch_02(numbers, key);
        System.out.println(index);
        int index_03 = linearSearch_03(numbers, key);
        System.out.println(index_03);
        int index_04 = linearSearch_04(numbers, key);
        System.out.println(index_04);
        int index_05 = linearSearch_05(numbers, key);
        System.out.println(index_05);
    }    
}
