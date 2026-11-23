class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int ans = helper(nums , target , 0, 0);

        return ans;
    }

    private int helper(int[] nums, int  target, int sum ,int i){


        if(nums.length == i)   return sum == target ? 1: 0;


        int left =  helper(nums, target, sum - nums[i] , i+1);
        int right = helper(nums, target, sum + nums[i] , i+1);

        return left + right;
    }
}