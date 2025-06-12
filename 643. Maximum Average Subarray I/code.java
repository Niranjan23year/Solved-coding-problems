class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Sum = 0;
        for (int i = 0; i < k; i++) {
            Sum += nums[i];
        }
        int maxSum = Sum;
        for (int i = k; i < nums.length; i++) {
            Sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, Sum);
        }
        return (double) maxSum / k;
    }
}
