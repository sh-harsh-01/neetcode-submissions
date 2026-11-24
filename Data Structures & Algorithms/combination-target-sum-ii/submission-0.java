class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int i, int[] c, int t, List<Integer> temp, List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i>=c.length || t<0) return;


        temp.add(c[i]);
        // take
        solve(i+1,c,t-c[i],temp,ans);
        temp.remove(temp.size()-1);
        // not take
        while (i + 1 < c.length && c[i] == c[i + 1]) {
            i++;
        }
        solve(i+1,c,t,temp,ans);
    }
}
