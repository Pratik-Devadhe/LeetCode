class Solution {

    public int[] findOrder(int n, int[][] prerequisites) {

        boolean[] vis = new boolean[n];
        boolean[] par = new boolean[n];

        // Check for cycle
        for (int i = 0; i < n; i++) {

            if (!vis[i]) {

                if (isCycle(i, prerequisites, vis, par)) {
                    return new int[]{};
                }
            }
        }

        // Reset visited array
        Arrays.fill(vis, false);

        Stack<Integer> st = new Stack<>();

        // Topological sort
        for (int i = 0; i < n; i++) {

            if (!vis[i]) {
                topologicalSort(i, st, prerequisites, vis);
            }
        }

        // Convert stack to int[]
        int[] ans = new int[n];

        int index = 0;

        while (!st.isEmpty()) {
            ans[index++] = st.pop();
        }

        return ans;
    }


    public boolean isCycle(int curr, int[][] prerequisites,
                           boolean[] vis, boolean[] par) {

        vis[curr] = true;
        par[curr] = true;

        for (int i = 0; i < prerequisites.length; i++) {

            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            if (u == curr) {

                if (!vis[v]) {

                    if (isCycle(v, prerequisites, vis, par)) {
                        return true;
                    }

                } else if (par[v]) {
                    return true;
                }
            }
        }

        par[curr] = false;

        return false;
    }


    public void topologicalSort(int curr, Stack<Integer> st,
                                int[][] prerequisites, boolean[] vis) {

        vis[curr] = true;

        for (int i = 0; i < prerequisites.length; i++) {

            int u = prerequisites[i][1];
            int v = prerequisites[i][0];

            if (u == curr && !vis[v]) {
                topologicalSort(v, st, prerequisites, vis);
            }
        }

        st.push(curr);
    }
}