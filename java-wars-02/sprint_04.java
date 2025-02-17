public class sprint_04 {
    public static void reverse_01(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void reverse_02(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void reverse_03(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void reverse_04(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void reverse_05(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp= numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {12, 23, 34, 45, 56, 67, 78, 89, 90, 99};
        reverse_01(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int[] array2 = {-45, -23, 0, 12, 34, 67, 89, 120};
        reverse_02(array2);

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        int[] array3 = {11, 22, 33, 44, 55, 66, 67, 77, 88, 99, 110, 121};
        reverse_03(array3);

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        
        int[] array4 = {65, 66, 67, 68, 69, 70};
        reverse_04(array4);

        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        int[] array5 = {10, 30, 50, 67, 90, 120, 150};
        reverse_05(array5);

        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }
        System.out.println();
    }
}
