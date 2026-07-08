class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
            if(token.equals("+")){
                int val1 = st.pop();
                int val2 = st.pop();
                int val = val1+val2;
                st.push(val);
            }else if(token.equals("-")){
                int val1 = st.pop();
                int val2 = st.pop();
                int val = val2-val1;
                st.push(val);
            }else if(token.equals("*")){
                int val1 = st.pop();
                int val2 = st.pop();
                int val = val1*val2;
                st.push(val);
            }else if(token.equals("/")){
                int val1 = st.pop();
                int val2 = st.pop();
                int val = val2/val1;
                st.push(val);
            }else{
                int val = Integer.parseInt(token);
                st.push(val);
            }
        }
        return st.peek();
    }
}
