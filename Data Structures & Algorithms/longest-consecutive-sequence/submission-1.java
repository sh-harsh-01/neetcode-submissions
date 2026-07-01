class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans = 1;
        for(int val:set){
            int key = val;
            int temp = 1;
            while(true){
                if(set.contains(key+1)){
                    key = key+1;
                    temp++;
                }else break;
            }
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}
