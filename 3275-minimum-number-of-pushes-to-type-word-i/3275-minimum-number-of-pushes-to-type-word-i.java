class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int count = 0;

        int n = word.length();

        while(n > 8){
            count++;
            ans += (8 * count);
            n -= 8;

        }
        count++;
        ans += (count * n);

        return ans;

    }
}