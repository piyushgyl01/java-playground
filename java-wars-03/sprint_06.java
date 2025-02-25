public class sprint_06 {
    public static boolean hasDuplicate_01(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicate_02(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int search(int [] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[left] <= numbers[mid]) {
                if (numbers[left] <= target && target < numbers[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (numbers[mid] < target && target <= numbers[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int maxProf(int[] prices) {
        int lowestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (lowestBuyPrice > prices[i]) {
                lowestBuyPrice = prices[i];
            } else {
                int profit = prices[i] - lowestBuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int trappedWater(int[] height) {
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

        for (int i = 0; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(hasDuplicate_01(nums)) ;

        int[] nums_02 = {1, 2, 3, 1};
        System.out.println(hasDuplicate_02(nums_02)) ;

       int[] nums_03 = {4,  5, 6, 7, 0, 1, 2}; 
       int target = 0 ;

       System.out.println(search(nums_03, target));

       int[] prices = {7, 1, 5, 3, 6,  4};   
       System.out.println(maxProf(prices));

       int[] height = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
       System.out.println(trappedWater(height));
    }
}
