class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;

        int num1 = 2, num2 = 1;

        for(int i = 0; i < n; i++){
            sumEven += num1;
            sumOdd += num2;
            num1 += 2;
            num2 += 2;
        }
        int ans =1;
        int count = 1;

        while(count <= sumEven || count <= sumOdd){
            if(sumEven % count == 0 && sumOdd % count == 0){
                ans = count;
            }
            count++;
        }

        return ans;

    }
}