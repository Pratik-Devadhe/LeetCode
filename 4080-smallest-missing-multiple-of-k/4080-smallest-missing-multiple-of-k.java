class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 1;

        for(int num : nums){
            if(k * i == num){
                i++;
            }
        }

        return k * i;
    }
}