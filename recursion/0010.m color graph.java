class Solution {

    boolean isSafe(int node, int[] color, boolean[][] graph, int n, int col) {

        for (int k = 0; k < n; k++) {
            if (graph[node][k] && color[k] == col) {
                return false;
            }
        }
        return true;
    }

    boolean solve(int node, int[] color, int m, int n, boolean[][] graph) {

        if (node == n) {
            return true;
        }

        for (int col = 1; col <= m; col++) {

            if (isSafe(node, color, graph, n, col)) {

                color[node] = col;

                if (solve(node + 1, color, m, n, graph)) {
                    return true;
                }

                color[node] = 0; // backtrack
            }
        }

        return false;
    }

    boolean graphColoring(int v, int[][] edges, int m) {

        boolean[][] graph = new boolean[v][v];

        // Convert edge list to adjacency matrix
        for (int[] edge : edges) {
            int u = edge[0];
            int w = edge[1];

            graph[u][w] = true;
            graph[w][u] = true;
        }

        int[] color = new int[v];

        return solve(0, color, m, v, graph);
    }
}
