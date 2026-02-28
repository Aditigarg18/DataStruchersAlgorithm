class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int[] ans = { -1, -1 };

        int low = 0, high = n - 1;

        // 🔹 Find first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target) {
                ans[0] = mid;
            }
        }

        low = 0;
        high = n - 1;

        // 🔹 Find last occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target) {
                ans[1] = mid;
            }
        }

        return ans;
    }
}
