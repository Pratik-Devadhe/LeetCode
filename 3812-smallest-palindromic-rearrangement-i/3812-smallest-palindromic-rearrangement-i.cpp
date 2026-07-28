class Solution {
public:
    string smallestPalindrome(string s) {
         vector<int> freq(26, 0);
        for (char c : s) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        char middleChar = 0;
        for (int i = 0; i < 26; ++i) {
            if (freq[i] % 2 == 1) {
                oddCount++;
                middleChar = 'a' + i;
            }
        }

        if (oddCount > 1) {
            return ""; // Not possible to form a palindrome
        }

        string leftHalf = "";
        for (int i = 0; i < 26; ++i) {
            leftHalf += string(freq[i] / 2, 'a' + i);
        }

        string rightHalf = leftHalf;
        reverse(rightHalf.begin(), rightHalf.end());

        string middle = (oddCount == 1) ? string(1, middleChar) : "";
        return leftHalf + middle + rightHalf; 
    }
};