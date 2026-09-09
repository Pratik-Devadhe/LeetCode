class Solution {
    public long countCommas(long n) {
        long count = 0;

        long base = 1000;

        for(int i =0; i <5 ; i++){
            if(n >= base){
                count += (n - base + 1);
            }
            base *= 1000;
        }

        return count;
    }
}