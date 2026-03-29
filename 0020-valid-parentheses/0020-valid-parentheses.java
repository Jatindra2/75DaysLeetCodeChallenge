class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        int len = s.length();
        for(int i = 0; i<len; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                brackets.push(ch);
            }else{
                if(brackets.isEmpty()){
                    return false; 
                }
                char c = brackets.pop();
                if((ch == ')' && c != '(') || (ch == '}' && c != '{') || (ch == ']' && c != '[')){
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}