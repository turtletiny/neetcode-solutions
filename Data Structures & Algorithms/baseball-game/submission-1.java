class Solution {
    public int calPoints(String[] operations) {
      int res = 0;
      Deque<Integer> scores = new ArrayDeque<>();  
      for (String s : operations) {
        if (s.equals("+")) {
            int top = scores.pop();
            int newTop = scores.peek();
            scores.push(top);
            scores.push(newTop + top);
            res += newTop + top;
        } else if (s.equals("D")) {
            int score = scores.peek() * 2;
            scores.push(score);
            res += score;
        } else if (s.equals("C")) {
            res -= scores.pop();
        } else {
            int score = Integer.parseInt(s);
            scores.push(score);
            res += score;
        }
      }
      return res; 
    }
}