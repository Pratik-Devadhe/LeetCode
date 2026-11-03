class Solution {
    public int minMoves(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        int ans = 0;

        for(int num : nums){
            ans += (nums[n-1] - num);
        }
        
        return ans;
    }
}