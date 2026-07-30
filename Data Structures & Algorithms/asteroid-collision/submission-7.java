class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int n : asteroids) {

            boolean pushAtEnd = false;
            while (true) {
                if (stack.isEmpty() || n > 0 || stack.peek() < 0) {
                    pushAtEnd = false;
                    stack.push(n);
                    break;
                } else if (stack.peek() > 0 && -n == stack.peek()) {
                    stack.pop();
                    pushAtEnd = false;
                    break;
                } else if (stack.peek() > 0 && -n > stack.peek()) {
                    stack.pop();
                    pushAtEnd = true;
                } else if (stack.peek() > 0 && stack.peek() > -n) {
                    pushAtEnd = false;
                    break;
                } else {
                    break;
                }
            }
            if (pushAtEnd) {
                stack.push(n);
            }
        }

        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
