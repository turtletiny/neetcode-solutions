class Solution {
  public String longestCommonPrefix(String[] strs) {
    int i = 0;
    while (true) {
      for (String s : strs) {
        if (i > s.length() - 1) {
          return s.substring(0, i);
        }

        char curChar = strs[0].charAt(i);
        if (s.charAt(i) != curChar) {
          return s.substring(0, i);
        }
      }
      i++;
    }
  }
}