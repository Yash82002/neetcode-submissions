class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxl=0,maxr=0,water=0;
        while(l<r){
            if(height[l]<=height[r]){
                if (height[l]<maxl)
                water+=maxl-height[l];
                else maxl=height[l];
                l++;
            }

            if(height[r]<height[l]){
                if (height[r]<maxr)
                water+=maxr-height[r];
                else maxr=height[r];
                r--;
            }
        }
        return water;
    }
}
