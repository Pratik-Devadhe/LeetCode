class Solution {
    public int min(int nums[] , int j ){
        int mini = Integer.MAX_VALUE;

        for(int i =j; i < nums.length; i++){
            mini = Math.min(mini , nums[i]);
        }

        return mini == Integer.MAX_VALUE ? 0: mini;
    }

    public int max(int nums[] , int j){
        int mini = Integer.MIN_VALUE;

        for(int i = 0; i <= j; i++){
            mini = Math.max(mini , nums[i]);
        }

        return mini == Integer.MIN_VALUE ? 0: mini;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

      

        for(int i =0; i < n; i++){
            int max = max(nums , i);
            int min = min(nums , i);
            if(max - min <= k){
                return i;
            }
        }
        
         return -1;
    }

   
}