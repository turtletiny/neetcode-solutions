class Solution {
  public String longestCommonPrefix(String[] strs) {
    String s = strs[0];
    for (String str : strs) {
      String curString = "";
      for (int i = 0; i < s.length() && i < str.length(); i++) {
        if (s.charAt(i) == str.charAt(i)) {
          curString += s.charAt(i);
        } else {
            break;
        }
      }

      if (curString.length() < s.length()) {
        s = curString;
      }
    }

    return s;
  }
}