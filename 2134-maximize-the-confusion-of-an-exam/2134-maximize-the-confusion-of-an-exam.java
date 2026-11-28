class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int fcount = 0;
        int tcount = 0;

        int n = answerKey.length();
        int ans = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {

            if (answerKey.charAt(i) == 'T') {
                tcount++;
            } else {
                fcount++;
            }

            while (left < i && Math.min(tcount, fcount) > k) {
                if (answerKey.charAt(left) == 'T') {
                    tcount--;
                } else {
                    fcount--;
                }
                left++;
            }
            ans = Math.max(ans, fcount + tcount);
        }

        return ans == 0 ? Math.max(tcount, fcount) : ans;

    }
}