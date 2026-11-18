class Solution {
    public int integerBreak(int n) {

        if(n == 2) return 1;

        if(n == 3) return 2;

        int mod = n % 3;
        int ans = 0;
        int div = n / 3;

        if(mod == 2) {
            ans = (int) Math.pow(3 , div);
            ans *= mod;
            return ans;
        }

        if( mod == 0){
            ans = (int) Math.pow(3 , div);
        }else{
            ans += Math.pow(3 , div -1);
            ans *= (mod + 3);
        }

        return ans;

        // 7 = 3 * 4 = 12

        // 8 = 3 * 3 * 2 = 18
    
        // 9 = 3 * 3 * 3 = 27
        // 10 = 3 * 3 * 4 = 36
        
    }
}