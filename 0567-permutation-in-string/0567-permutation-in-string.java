class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int required = s1.length();

        while (right < s2.length()) {

            char r = s2.charAt(right);

            if (count[r - 'a'] > 0) {
                required--;
            }

            count[r - 'a']--;
            right++;

            if (required == 0) {
                return true;
            }

            if (right - left == s1.length()) {

                char l = s2.charAt(left);

                if (count[l - 'a'] >= 0) {
                    required++;
                }

                count[l - 'a']++;
                left++;
            }
        }

        return false;
    }
}