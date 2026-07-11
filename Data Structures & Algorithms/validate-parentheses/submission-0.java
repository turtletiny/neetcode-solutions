class Solution {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> matches = new HashMap<>();
    matches.put(']', '[');
    matches.put('}', '{');
    matches.put(')', '(');

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        if (stack.pop() != matches.get(c)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
