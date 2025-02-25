public class sprint_04 {
    public static int trappedWater_01(int height[]) {
        int n = height.length;
        int trappedWater = 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static int trappedWater_02(int height[]) {
        int n = height.length;
        int trappedWater = 0;

        int [] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int [] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater; 
    }

    public static int trappedWater_03(int height[]) {
        int n = height.length;
        int trappedWater = 0;

        int [] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int [] rightMax = new int[n];
        rightMax [n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static int trappedWater_04(int height[]) {
        int n = height.length;
        int trappedWater = 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static int trappedWater_05(int height[]) {
        int n = height.length;
        int trappedWater = 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];    
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] array1 = {5, 2, 8, 10, 1, 7, 3, 9, 4, 6};
        System.out.println(trappedWater_01(array1));

        int[] array2 = {42, 17, 33, 8, 21, 55, 29, 13, 36, 44, 19, 27};
        System.out.println(trappedWater_02(array2));

        int[] array3 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        System.out.println(trappedWater_03(array3));

        int[] array4 = {18, 22, 7, 31, 25, 13, 29, 10, 5, 16, 30, 19};
        System.out.println(trappedWater_04(array4));

        int[] array5 = {0, 7, 0, 3, 8, 0, 5, 2, 9, 0, 4, 6, 0, 1};
        System.out.println(trappedWater_05(array5));

    }
}
