class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        solve(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void solve(int idx, int[] nums, ArrayList<Integer>temp,ArrayList<List<Integer>> result){
        result.add(new ArrayList(temp));
        for(int i=idx;i<nums.length;i++){
            //Include
            temp.add(nums[i]);
            solve( i+1, nums,temp,result);

            //Exclude 
            temp.remove(temp.size()-1);
            
        }
    }
}
