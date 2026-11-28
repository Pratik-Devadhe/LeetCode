class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashMap<String , Integer> map = new HashMap<>();

        int n = s.length();
        StringBuilder sb  = new StringBuilder();
        List<String> ans = new ArrayList<>();

        if(n < 10) return ans;

        sb.append(s.substring(0,10));

        for(int i = 10; i < n; i++){

            map.put(sb.toString() , map.getOrDefault(sb.toString() , 0) + 1);
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
        }

        map.put(sb.toString() , map.getOrDefault(sb.toString() , 0) + 1);

        for(Map.Entry<String, Integer> str : map.entrySet()){

            if(str.getValue() > 1){
                ans.add(str.getKey());
            }

        }

        return ans;
    }
}