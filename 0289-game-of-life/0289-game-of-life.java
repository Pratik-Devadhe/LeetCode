class Solution {
    public void gameOfLife(int[][] board) {


        int n = board.length;
        int m = board[0].length;

        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                int dead = 0, live = 0;

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j +1; l++) {
                        

                        if (k < 0 || l < 0 || k >= n || l >= m ||  (k == i && l == j)  ) {
                            continue;
                        } else {
                            if (board[k][l] == 0) {
                                dead++;
                            } else {
                                live++;
                            }
                        }

                    }
                }
                if (board[i][j] == 1) {

                            if (live < 2 || live > 3) {
                                ans[i][j] = 0;
                            }else{
                                ans[i][j] = 1;
                            }

                        } else {
                            if (live == 3) {
                                ans[i][j] = 1;
                            }
                        }
            }
        }

       for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        board[i][j] = ans[i][j];
    }
}

    }
}