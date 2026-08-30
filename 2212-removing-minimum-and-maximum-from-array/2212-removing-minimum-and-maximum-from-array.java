class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = 1;
        int max = 1;

        for(int i =0; i < n; i++){

            if(nums[i] < nums[min-1]){
                min = i+1;
            }

            if(nums[i] > nums[max-1]){
                max = i+1;
            }

        }

        

        int left = Math.max(min , max );
        int right = n -  Math.min(min, max ) +1 ;
        int both = Math.min(min , n - min+1) + Math.min(max  , n - max + 1) ;

        return Math.min(left , Math.min(right , both));
    }
}