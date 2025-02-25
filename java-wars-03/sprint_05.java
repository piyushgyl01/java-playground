public class sprint_05 {
    public static int maxProf_01(int prices[]) {
        int lowestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (lowestBuyPrice < prices[i]) {
                int profit = prices[i] - lowestBuyPrice;
                maxProfit = Integer.max(maxProfit, profit);
            } else {
                lowestBuyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int maxProf_02(int prices[]) {
        int lowestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestBuyPrice) {
                lowestBuyPrice = prices[i];
            } else {
                int profit = prices[i] - lowestBuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int maxProf_03(int prices[]) {
        int lowestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestBuyPrice) {
                lowestBuyPrice = prices[i];
            } else {
                int profit = prices[i] - lowestBuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int maxProf_04(int prices[]) {
        int lowestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestBuyPrice) {
                lowestBuyPrice = prices[i];
            } else {
                int profit = prices[i] - lowestBuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int maxProf_05(int prices[]) {
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
    public static void main(String[] args) {
        int[] array1 = {12, 23, 34, 45, 6, 67, 78, 89, 90, 99};
        System.out.println(maxProf_01(array1));

        int[] array2 = {12, 34, 67, 89, 120};
        System.out.println(maxProf_02(array2));

        int[] array3 = {11, 22, 33, 44, 55, 66, 67, 77, 88, 99, 110, 121};
        System.out.println(maxProf_03(array3));

        int[] array4 = {65, 66, 67, 68, 69, 70};
        System.out.println(maxProf_04(array4));

        int[] array5 = {10, 30, 50, 67, 90, 120, 150};
        System.out.println(maxProf_05(array5));

    }
}
