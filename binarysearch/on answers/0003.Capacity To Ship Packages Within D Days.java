class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt(); // min possible capacity
        int right = Arrays.stream(weights).sum();           // max possible capacity

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, D, mid)) {
                right = mid;       // mid works → try smaller capacity
            } else {
                left = mid + 1;    // mid too small → need larger capacity
            }
        }

        return left;  // minimum capacity
    }

    // Helper: check if we can ship all packages in D days with capacity 'cap'
    private boolean canShip(int[] weights, int D, int cap) {
        int days = 1;
        int sum = 0;
        for (int w : weights) {
            if (sum + w > cap) {  // exceed capacity → next day
                days++;
                sum = 0;
            }
            sum += w;
        }
        return days <= D;
    }
}
