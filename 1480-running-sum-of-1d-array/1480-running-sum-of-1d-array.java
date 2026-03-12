class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i==0){
                runningsum[i] += nums[i];
            }else{
                runningsum[i] = runningsum[i-1]+nums[i];
            }
        }
        return runningsum;
    }
}