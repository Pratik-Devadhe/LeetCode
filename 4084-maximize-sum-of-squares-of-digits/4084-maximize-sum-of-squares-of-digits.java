class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if(9 * num < sum) return "";

        StringBuilder sb = new StringBuilder("");


        for(int i=0; i < num; i++){

            if(sum > 9){
                sum -= 9;
                sb.append('9');
            }else{
                sb.append(sum);
                sum -= sum;
            }

            

        }

        return sb.toString();
        
    }
}