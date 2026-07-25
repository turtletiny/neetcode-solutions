class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+")) {
                int num = stack.pop() + stack.pop();
                stack.push(num);

            } else if (s.equals("*")) {
                int num = stack.pop() * stack.pop();
                stack.push(num);

            } else if (s.equals("-")) {
                int numToBeSubtracted = stack.pop();
                stack.push(stack.pop() - numToBeSubtracted);

            } else if (s.equals("/")) {
                int numToBeDivided = stack.pop();
                stack.push(stack.pop() / numToBeDivided);

            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}

