class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=0,rmax=0,trap=0;
        while (l<r){
            if(height[l]<=height[r]){
                if (height[l]<lmax)
                trap+=lmax-height[l];
                else lmax=height[l];
                l++;
            }

            else {
                if (height[r]<rmax)
                trap+=rmax-height[r];
                else rmax=height[r];
                r--;
            }
        }
        return trap;
    }
}
