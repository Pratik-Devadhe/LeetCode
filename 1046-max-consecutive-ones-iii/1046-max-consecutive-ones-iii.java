class Solution {
    public int longestOnes(int[] nums, int k) {
        int n =  nums.length;

        int count = 0;
        int left =0;
        int zeroCount = 0;

        for(int i =0; i < n; i++){

            if(nums[i] == 0) zeroCount++;

            while( left < n && zeroCount > k){
                if(nums[left] == 0) zeroCount--;
                left++;
            }

            count = Math.max(count , i - left + 1);

        }

        return count;
    }
}