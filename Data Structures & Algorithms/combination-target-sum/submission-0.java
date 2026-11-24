class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,target,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int []nums, int i, int target, List<Integer> temp, List<List<Integer>> ans){
        if(i>=nums.length || target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        // Take
        solve(nums,i,target-nums[i],temp,ans);
        temp.remove(temp.size()-1);
        // Not Take
        solve(nums,i+1,target,temp,ans);
    }
}
