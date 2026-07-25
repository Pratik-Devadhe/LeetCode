class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int maxi = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            int rem = n % 10;

            if (maxi <= rem) {
                max = maxi;
                maxi = rem;
            } else if (rem > max) {
                max = rem;
            }

            n /= 10;
        }

        return maxi * max;
    }
}