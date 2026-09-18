class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String val = tokens[i];
            if(val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")){
                if(val.equals("+")){
                    int x = st.pop();
                    int y = st.pop();
                    int ans = x+y;
                    st.push(ans);
                }
                if(val.equals("-")){
                    int x = st.pop();
                    int y = st.pop();
                    int ans = y-x;
                    st.push(ans);
                }
                if(val.equals("*")){
                    int x = st.pop();
                    int y = st.pop();
                    int ans = x*y;
                    st.push(ans);
                }
                if(val.equals("/")){
                    int x = st.pop();
                    int y = st.pop();
                    int ans = y/x;
                    st.push(ans);
                }
            }else{
                int x = Integer.valueOf(val);
                st.push(x);
            }
        }
        if(!st.isEmpty()) return st.pop();
        return 0;
    }
}