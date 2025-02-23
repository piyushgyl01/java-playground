public class sprint_03 {
    public static int binarySearch_01(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_02(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_03(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_04(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (end >= start) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] >= key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch_05(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

       while (end >= start) {
        int mid = (end + start) / 2;

        if (numbers[mid] == key) {
            return mid;
        }

        if (numbers[mid] >= key) {
            end = mid - 1;
        } else {
            start = start + 1;
        }
       }
       return -1;
    }

    public static int binarySearch_06(int numbers[], int key) {
        int start = 0; 
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_07(int numbers[], int key) {
        int start = 0; 
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_08(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_09(int numbers[], int key) {
        int start = 0; 
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch_10(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {12, 23, 34, 45, 56, 67, 78, 89, 90, 99};
        int key1 = 900;
        System.out.println(binarySearch_01(array1, key1));

        int[] array2 = {-45, -23, 0, 12, 34, 67, 89, 120};
        int key2 = 34;
        System.out.println(binarySearch_02(array2, key2));
        
        int[] array3 = {11, 22, 33, 44, 55, 66, 67, 77, 88, 99, 110, 121};
        int key3 = 11;
        System.out.println(binarySearch_03(array3, key3));
        
        int[] array4 = {65, 66, 67, 68, 69, 70};
        int key4 = 70;
        System.out.println(binarySearch_04(array4, key4));
        
        int[] array5 = {10, 30, 50, 67, 90, 120, 150};
        int key5 = 50;
        System.out.println(binarySearch_05(array5, key5));
        int key6 = 150;
        System.out.println(binarySearch_06(array5, key6));
        System.out.println(binarySearch_07(array5, key6));
        System.out.println(binarySearch_08(array5, key6));
        System.out.println(binarySearch_09(array5, key6));
        System.out.println(binarySearch_10(array5, key6));

    }    
}
