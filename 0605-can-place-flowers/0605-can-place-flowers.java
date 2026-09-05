class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;

        int count = 0;

        if(length == 1 && flowerbed[0] == 0) count++;

        if( 1 < length-1 &&  flowerbed[1] == 0 && flowerbed[0] == 0){
            flowerbed[0] = 1;
            count++;
        }

        if( length -2 >= 0 && flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0){
            flowerbed[length-1] = 1;
            count++;
        }


        for(int i =0; i < length; i++){

            if(i-1 >= 0 && i+1 <= length -1 && flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                count++;
            }


        }

        

        return count < n ? false : true;
    }

}