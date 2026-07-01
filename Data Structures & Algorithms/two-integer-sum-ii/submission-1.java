class Solution {
    public int[] twoSum(int[] n, int target) {
        int i=0,j=n.length-1;
        int [] ans = new int[2];
        while(i<j){
            if(n[i]+n[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }else if(n[i]+n[j]<target){
                i++;
            }else j--;
        }
        return ans;
    }
}
