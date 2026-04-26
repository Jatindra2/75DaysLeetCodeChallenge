class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String s = strs[0];
        int m = s.length();
        String ans = "";
        for(int i = 0; i<m; i++){
            char c = s.charAt(i);
            for(int j = 0; j<n; j++){
                if(j == 0){
                    continue;
                }
                if(strs[j].length() <= i || c != strs[j].charAt(i)){
                    return ans;
                }
            }
            ans = ans +c;
        }
        return ans;
    }
}