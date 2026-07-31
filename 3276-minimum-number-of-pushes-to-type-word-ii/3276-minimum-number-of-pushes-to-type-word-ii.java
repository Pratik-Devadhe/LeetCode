class Solution {
    public int minimumPushes(String s) {
        int[] arr = new int[26];

        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = 25; i >= 0 && arr[i] > 0 ; i--){
            count += arr[i] * ( (25 - i) / 8 + 1);
        }

        return count;

    }
}