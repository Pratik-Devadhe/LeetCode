class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;

        Stack<Integer> st = new Stack<>();

        for(int i =0; i < n; i++){

            if(tokens[i].equals("+")){
                int digit1 = st.pop();
                int digit2 = st.pop();

                st.add(digit1 + digit2);
            }else if(tokens[i].equals("-")){
                int digit1 = st.pop();
                int digit2 = st.pop();

                st.add(digit2 - digit1);
            }else if(tokens[i].equals("*")){
                int digit1 = st.pop();
                int digit2 = st.pop();

                st.add(digit1 * digit2);
            }else if(tokens[i].equals("/")){
                int digit1 = st.pop();
                int digit2 = st.pop();

                st.add(digit2 / digit1);
            }else{
                st.add(Integer.parseInt(tokens[i]));
            }

        }

        return st.peek();
    }
}