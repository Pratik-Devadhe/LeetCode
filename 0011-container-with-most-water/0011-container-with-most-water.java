class Solution {
    public int maxArea(int[] height) {
        int  n = height.length;

        int ans =0;

        int i =0;
        int r = n-1;
        
        while(i <= r){

            ans = Math.max(ans , Math.min(height[i] , height[r]) * (r - i));

            if(height[i] < height[r]){
                i++;
            }else{
                r--;
            }

        }
        
        return ans;

    }
}