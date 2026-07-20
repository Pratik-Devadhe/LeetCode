class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();

        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        k = k % (n * m);
        int curr;

        for (int l = 0; l < k; l++) {

            int temp = grid[0][0];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    if (j == m - 1) {

                        if (i + 1 < n) {
                            curr = grid[i + 1][0];
                            grid[i + 1][0] = temp;
                            temp = curr;
                        }

                    } else {
                        curr = grid[i][j+1];
                        grid[i][j + 1] = temp;
                        temp = curr;
                    }

                    if (j == m - 1 && i == n - 1) {
                        curr = grid[i][j];
                        grid[0][0] = temp;
                        temp = curr;
                    }

                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.get(i).add(grid[i][j]);
            }
        }

        return list;
    }
}