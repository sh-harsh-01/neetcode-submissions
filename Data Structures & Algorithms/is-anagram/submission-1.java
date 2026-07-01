class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character,Integer> map = new HashMap<>();
        // if(s.length()!=t.length()) return false;

        // for(int i=0;i<s.length();i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i),1);
        //     }
        //     else{
        //         map.put(s.charAt(i),map.get(s.charAt(i))+1);
        //     }
        // }

        // for(int i = 0; i < t.length(); i++){
        //     char c = t.charAt(i);
        //     if(!map.containsKey(c) || map.get(c) == 0){
        //         return false; 
        //     }
        //     map.put(c, map.get(c) - 1);
        // }

        // // for(int key:map.keySet()){
        // //     if(map.get(key)!=0){
        // //         return false;
        // //     }
        // // }
        // return true;


        if(s.length()!=t.length()) return false;
        int [] arr = new int[27];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }

}
