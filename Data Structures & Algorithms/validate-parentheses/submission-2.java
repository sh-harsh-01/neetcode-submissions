class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
         int i=0;
         while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    if(s.charAt(i)==')' && st.peek()=='(' || 
                    s.charAt(i)=='}' && st.peek()=='{'|| 
                    s.charAt(i)==']' && st.peek()=='[') st.pop();
                    else return false;
                }else{
                    return false;
                }
            }
            i++;
         }
         if(!st.isEmpty()) return false;
        return true;
    }
}
