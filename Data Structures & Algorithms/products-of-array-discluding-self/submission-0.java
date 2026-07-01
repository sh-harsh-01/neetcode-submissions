class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int [] ans = new int[nums.length];

        int [] pre = new int[nums.length]; 
        int [] suf = new int[nums.length]; 
        Arrays.fill(pre,1);
        Arrays.fill(suf,1);

        // preifx
        for(int i=1;i<nums.length;i++){
            prod = prod * nums[i-1];
            pre[i] = prod;
        }

        prod = 1;
        // suffix
        for(int i=nums.length-2;i>=0;i--){
            prod *= nums[i+1];
            suf[i] = prod;

        }
        System.out.println("Pre" + Arrays.toString(pre));
        System.out.println("Suf" + Arrays.toString(suf));
        int j=0;
        for(int i=0;i<nums.length;i++){
            ans[j++] = suf[i]*pre[i];
        }
        return ans;
    }
}  
