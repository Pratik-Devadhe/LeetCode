class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int left = height[0];

        int right[] = new int[n];

        right[n-1] = height[n-1];

        for(int i =n-2; i >= 0; i--){

            right[i] = Math.max(height[i] , right[i+1]);
        }

        int count = 0;

        for(int i =0; i < n ; i++){
            left = Math.max(left , height[i]);

                count = count + Math.min(right[i] , left) - height[i];

                

        }

        return count;
    }
}