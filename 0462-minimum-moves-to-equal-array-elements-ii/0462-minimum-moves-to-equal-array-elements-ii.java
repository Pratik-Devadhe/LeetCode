class Solution {
    public int minMoves2(int[] nums) {

        // find the median
        Arrays.sort(nums);


        int n = nums.length;

        int mid = nums[n / 2];

        int count = 0;

        for(int i =0; i < n; i++){

            count += Math.abs(nums[i] - mid);

        }

        return count;        
    }
}