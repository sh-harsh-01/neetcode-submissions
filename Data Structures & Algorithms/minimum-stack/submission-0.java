class MinStack {
    Stack<Integer> st;
    public MinStack() {
       st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!st.isEmpty()){
            int val = st.pop();
            if(val<min) min = val;
            temp.push(val);
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return min;
    }
}
