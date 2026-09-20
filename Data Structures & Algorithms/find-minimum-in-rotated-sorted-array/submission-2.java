class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1, ans = Integer.MAX_VALUE;
        while(l<=h){
            int mid = (l+h)/2;
            ans = Math.min(ans,Math.min(nums[l],Math.min(nums[h],nums[mid])));
            if(nums[l]>nums[mid]){
                h = mid-1;
            }
            else if(nums[h]<nums[mid]){
                l = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                break;
            }
        }
        return ans;
    }
}
