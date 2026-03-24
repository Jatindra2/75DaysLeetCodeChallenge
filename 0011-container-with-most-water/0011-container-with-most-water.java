class Solution {
    public int maxArea(int[] height) {
        int max_water = 0;
        int n = height.length;
        int lh = 0;
        int rh = n-1;
        while(lh<rh){
            int wd = rh-lh;
            int h = Math.min(height[lh], height[rh]);
            max_water = Math.max(max_water, h*wd);
            if(height[lh]<height[rh]){
                lh++;
            }else{
                rh--;
            }
        }
        return max_water;
    }
}