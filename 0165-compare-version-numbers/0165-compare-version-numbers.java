class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int n = v1.length;
        int m = v2.length;
        
        for(int i =0; i < Math.max(n,m); i++){
            
            long n1 = i < n ? (long) Integer.parseInt(v1[i]): 0;
            long n2 = i < m ? (long) Integer.parseInt(v2[i]): 0;
            
            if(n1 < n2){
                return -1;
            }else if(n1 > n2){
                return 1;
            }
        }
        
        return 0;
    }
}