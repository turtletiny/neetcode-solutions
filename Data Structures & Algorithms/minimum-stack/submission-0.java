class MinStack {
    Stack<Integer> s;
    Stack<Integer> mins;

    MinStack() {
        s = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int val) {
        if (!s.isEmpty()) {
            if (val <= mins.peek()) {
                mins.push(val);
            } else {
                mins.push(mins.peek());
            }
            s.push(val);
        } else {
            s.push(val);
            mins.push(val);
        }
    }

    public void pop() {
        s.pop();
        mins.pop();

    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return mins.peek();

    }

}
