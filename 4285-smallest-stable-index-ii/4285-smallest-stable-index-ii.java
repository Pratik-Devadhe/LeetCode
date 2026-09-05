class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] min = new int[n];

        int mini = Integer.MAX_VALUE;

        for(int i =n-1; i >=0; i--){
            mini = Math.min(mini , nums[i]);
            if(mini == Integer.MAX_VALUE){
                min[i] = -1;
            }else{
                min[i] = mini;
            }
        }

        int maxi = Integer.MIN_VALUE;
        int max[] = new int[n];
        for(int i =0; i < n; i++){
            maxi = Math.max(maxi , nums[i]);
            if(maxi == Integer.MIN_VALUE){
                max[i] = -1;
            }else{
                max[i] = maxi;
            }
        }

        for(int i =0; i < n ;i++){
                if(max[i] - min[i] <= k)return i;
        }

        return -1;
        
    }
}