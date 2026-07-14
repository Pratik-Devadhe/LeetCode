class Solution {
    public int[] sortByBits(int[] arr) {
        List<int[]> list = new ArrayList<>();
        
        for(int num : arr){
            int count = 0;
            
            int original = num;

while(num > 0){
    if(num % 2 == 1) count++;
    num /= 2;
}

list.add(new int[]{original, count});
        }
        
        
        Collections.sort(list , (a,b) -> {
            if(a[1] == b[1]){
                
                return a[0]-b[0];
            }
            
            return a[1]-b[1];
        });
        
        
        for(int i=0; i < list.size(); i++){
            arr[i] = list.get(i)[0];
        }
        
        return arr;
        
    }
}