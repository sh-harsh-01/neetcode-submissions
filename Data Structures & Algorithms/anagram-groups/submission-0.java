class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans =  new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = "";
            for(int j=0;j<arr.length;j++) s+=arr[j];

            if(map.containsKey(s)){
                map.get(s).add(str);
            }
            else{
                map.put(s,new ArrayList<>());
                map.get(s).add(str);
            }
        }

        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
