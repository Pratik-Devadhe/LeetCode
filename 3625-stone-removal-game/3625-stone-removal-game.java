class Solution {
    public boolean canAliceWin(int n) {
         int count = 0;
        int stones = 10;

        while(true){

            if(stones <= n){

                n = n - stones;
                stones--;
                count++;
            }
            else{
                break;
            }
        }


        if(count % 2 == 0){
            return false;
        }
        else{
            return true;
            
        }
    }
}