class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if("+-*/".contains(s)){
                int x = stack.pop();
                int y = stack.pop();
                switch(s){
                    case "+":
                        stack.push(y+x);
                        break;
                    case "-":
                        stack.push(y-x);
                        break;
                    case "*":
                        stack.push(y*x);
                        break;
                    case "/":
                        stack.push(y/x);
                }
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}