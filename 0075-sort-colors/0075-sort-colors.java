class Solution {
    public void sortColors(int[] nums) {
        int lp = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                int temp = nums[lp];
                nums[lp] = nums[i];
                nums[i] = temp;
                lp++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                int temp = nums[lp];
                nums[lp] = nums[i];
                nums[i] = temp;
                lp++;
            }
        }
    }
}