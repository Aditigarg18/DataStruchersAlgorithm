class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;                          // min divisor
        int right = Arrays.stream(nums).max().getAsInt(); // max divisor

        while (left < right) {
            int mid = left + (right - left)/2;

            if (canDivide(nums, mid, threshold)) {
                right = mid;   // mid works → try smaller divisor
            } else {
                left = mid + 1; // mid too small → sum exceeds threshold
            }
        }

        return left;  // minimum divisor
    }

    // Helper: check if sum of ceil(nums[i]/divisor) <= threshold
    private boolean canDivide(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1)/divisor; // ceiling division
        }
        return sum <= threshold;
    }
}
   
