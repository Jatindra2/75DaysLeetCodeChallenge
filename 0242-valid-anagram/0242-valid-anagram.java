class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            HashMap<Character, Integer> s1 =new HashMap<>();
            HashMap<Character, Integer> t1 =new HashMap<>();
            for(int i = 0; i<s.length(); i++){
                s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i), 0)+1);
                t1.put(t.charAt(i), t1.getOrDefault(t.charAt(i), 0)+1);
            }
            for(Map.Entry<Character, Integer> entry : s1.entrySet()){
                if(!entry.getValue().equals(t1.get(entry.getKey()))){
                    return false;
                }
            }
            return true;
        }
    }
}