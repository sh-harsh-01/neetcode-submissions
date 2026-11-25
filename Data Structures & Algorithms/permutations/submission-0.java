class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums, new boolean[nums.length],new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int idx, int[] nums, boolean []used, List<Integer> temp, List<List<Integer>>ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true) continue;
            used[i] = true;
            temp.add(nums[i]);
            solve(i+1,nums,used,temp,ans);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}
