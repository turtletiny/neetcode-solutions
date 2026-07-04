class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int prev = stack.peek();
                stack.push(prev * 2);
            } else {
                stack.push(Integer.parseInt(op));
            }

        }
        int res = 0;
        for (int n : stack) {
            res += n;
        }
        return res;
    }
}

