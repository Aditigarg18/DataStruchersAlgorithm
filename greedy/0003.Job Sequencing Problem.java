import java.util.*;

class Solution {

    int[] parent;

    int find(int x) {
        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        List<int[]> jobs = new ArrayList<>();

        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs.add(new int[]{deadline[i], profit[i]});
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        jobs.sort((a, b) -> Integer.compare(b[1], a[1]));

        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int count = 0;
        int totalProfit = 0;

        for (int[] job : jobs) {

            int availableSlot = find(job[0]);

            if (availableSlot > 0) {

                count++;
                totalProfit += job[1];

                // mark slot occupied
                parent[availableSlot] = find(availableSlot - 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(totalProfit);

        return ans;
    }
}
