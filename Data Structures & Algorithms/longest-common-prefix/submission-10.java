class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String first = strs[0];
        int charIndex = 0;

        while (charIndex < first.length()) {
            for (String s : strs) {
                if (charIndex >= s.length() || s.charAt(charIndex) != first.charAt(charIndex)) {
                    return res;
                }
            }
            res += first.charAt(charIndex);
            charIndex++;
        }

        return res;
    }
}
