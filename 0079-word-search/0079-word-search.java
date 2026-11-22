class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        boolean vis[][] = new boolean[n][m];

        for(int i =0; i < n; i++){

            for(int j =0;j < m; j++){

                if(helper(board , i , j , n , m, word , 0, vis)){
                    return true;
                }

            }
        }
        return false;
   }

   private boolean helper(char[][] board, int  i, int j, int n, int m, String word, int curr, boolean[][] vis){

        if(curr == word.length()) return true;

        if(i < 0 || i >= n|| j < 0 || j >=m ) return false;

        if( vis[i][j] || board[i][j] != word.charAt(curr)){
            return false;
        }



        

            vis[i][j] = true;

        boolean ans =  helper(board , i +1 , j , n , m ,word, curr+1, vis) || helper(board , i , j +1 , n , m ,word, curr+1, vis) ||
         helper(board , i -1, j , n , m ,word, curr+1, vis) || helper(board , i  , j-1 , n , m ,word, curr+1, vis);

        

        vis[i][j] = false;

        return ans;

   }
}