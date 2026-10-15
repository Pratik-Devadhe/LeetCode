class TreeAncestor {

    
    int n;
    static int LOG = 20;
    int[][] up;

    public TreeAncestor(int n, int[] p) {
        this.n = n;
        up = new int[n][LOG];

        for(int i =0; i < n; i++){
            up[i][0] = p[i];
        }
        
        for(int j =1; j < LOG;j++){

            for(int node = 0; node < n; node++){

                int mid = up[node][j-1];

                if(mid != -1){
                    up[node][j] = up[mid][j-1];
                }else{
                    up[node][j] = -1;
                }

            }

        }

        
    }
   
    public int getKthAncestor(int node, int k) {
        
        for(int i =0; i < LOG; i++){

            if( (k & 1 << i) != 0){

                node = up[node][i];

            }

            if(node == -1) return -1;

        }

        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */