class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int n = temperatures.length;
        int answer[] = new int[n];
        for(int i = 0; i<n; i++){
            while(!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()]){
                int top = temp.pop();
                answer[top] = i-top;
            }
            temp.push(i);
        }
        return answer;
    }
}