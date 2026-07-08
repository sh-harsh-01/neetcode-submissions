class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pre = new int[heights.length];
        int[] next = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        // Calculating the pre
        for(int i=0;i<heights.length;i++){
            if(st.isEmpty()){
                pre[i] = -1;
                st.push(i); 
                continue;
            }
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            pre[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i); 
        }

        st.clear();
        // Calculating the next
        for(int i=heights.length-1;i>=0;i--){
            if(st.isEmpty()){
                next[i] = heights.length;
                st.push(i); 
                continue;
            }
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            next[i] = st.isEmpty() ? heights.length : st.peek();
            st.push(i); 
        }

        int max = -1;
        for(int i=0;i<heights.length;i++){
            int p = pre[i]; 
            int n = next[i]; 
            int val = heights[i]*(n-p-1);
            max = Math.max(val,max);
        }
        return max;
    }
}
