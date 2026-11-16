class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        while(sb.length() > k){

            StringBuilder temp = new StringBuilder();

            for(int i = 0; i < sb.length(); i+= k){

                int count = 0;

                for(int j = i; j < i + k && j < sb.length(); j++){
                    count += sb.charAt(j) - '0';
                }
                // System.out.println(count);
                temp.append(count);

            }

            sb.setLength(0);
            sb.append(temp);

        }

        return sb.toString();
    }
}