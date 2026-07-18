class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int low = 0; 
        int high = nums.length - 1;

        HashMap<Integer , Integer> map = new HashMap<>();

       

    for(int i =0; i < nums.length; i++){
        int need = target - nums[i];

        if(map.containsKey(need)){
            return new int[]{i , map.get(need)};
        }

        map.put(nums[i] , i);
    }


        return new int[]{-1,-1};
        
    }
}