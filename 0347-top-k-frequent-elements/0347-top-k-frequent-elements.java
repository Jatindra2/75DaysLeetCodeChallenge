class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i], freq.get(nums[i])+1);
            }else{
                freq.put(nums[i], 1);
            }
        }
        int arr[][] = new int[freq.size()][2];
        int x = 0;
        for(HashMap.Entry<Integer, Integer> entry : freq.entrySet()){
            arr[x][0] = entry.getKey();
            arr[x][1] = entry.getValue();
            x++;
        }
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
        int output[] = new int[k];
        for(int i = 0; i<k; i++){
            output[i] = arr[freq.size()-i-1][0];
        }
        return output;
    }
}