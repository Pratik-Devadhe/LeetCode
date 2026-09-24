class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for(int i =0; i < n; i++){

            while( set.size() > 0 && set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;

                
            }

            max = Math.max(max , i - left + 1);
            set.add(s.charAt(i));
        }

        return max;

    }
}