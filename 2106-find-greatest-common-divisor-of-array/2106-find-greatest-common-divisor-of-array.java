class Solution {
    public int findGCD(int[] nums) {
        int low = 1003;
        int high = 0;

        for(int num : nums){
            low = Math.min(low , num);
            high = Math.max(high , num);
        }

        int ans = 1;

        for(int i = 2; i <= low; i++){
            if( low % i == 0 && high % i == 0){
                ans = i;
            }
        }

        return ans;
    }
}