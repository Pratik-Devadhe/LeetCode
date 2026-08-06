class Solution {

    public boolean isDivisible(int n , int t){

        int p = 1;

        while(n > 0){
            p *= n % 10;
            n /= 10;
        }

        return p % t == 0;
    }
    public int smallestNumber(int n, int t) {
        while(!isDivisible(n , t)){
            n++;
        }

        return n;
    }
}