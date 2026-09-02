class Solution {
    public boolean uniformArray(int[] nums1) {
        int count = 0;
        int n = nums1.length;

        for(int num : nums1){
            if(num % 2 == 1) count++;
        }

        return true;
    }
}