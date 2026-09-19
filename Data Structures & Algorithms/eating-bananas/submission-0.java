class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max =0;
        for(int i=0;i<piles.length;i++)max = Math.max(max,piles[i]);
        int ans = max;

        while(min<=max){
            int mid = (min+max)/2;
            if(check(piles,h,mid)){
                max = mid-1;
                ans = Math.min(ans,mid);
            }
            else min = mid+1;
        }

        return ans;
    }
    public boolean check(int [] piles, int h, int k){
        for(int i=0;i<piles.length;i++){
            int val = piles[i];
            if(val%k==0) h = h-val/k;
            else h = (h-val/k)-1;
        }
        if(h>=0) return true;
        return false;
    }
}