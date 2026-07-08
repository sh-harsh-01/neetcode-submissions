class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[t.length];
        for(int i=t.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(i);
                continue;
            }
            while(!st.isEmpty()){
                if(t[st.peek()]<=t[i]) st.pop();
                else{
                    ans[i] = st.peek()-i;
                    break;
                }
            }
        st.push(i);
        }
        return ans;
    }
}
