class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0, i=0,j=0;
        map.put(s.charAt(i),1);
        while(j<s.length()){
            while(map.containsKey(s.charAt(j)) && i<j){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;
            }
            map.put(s.charAt(j),1);
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
