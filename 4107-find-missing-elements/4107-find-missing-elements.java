class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for(int i=1; i < nums.length; i++){
            if(nums[i] - nums[i-1] > 1){
                int temp = nums[i-1] + 1;
                while(nums[i] - temp >= 1){
                    ans.add(temp);
                    temp++;
                }
            }
        }

        return ans;
    }
}