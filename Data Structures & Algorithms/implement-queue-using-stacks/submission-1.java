class MyQueue {
    Stack<Integer> s;
    public MyQueue() {
        s = new Stack<>();
    }
    
    public void push(int x) {
        int size = s.size();
       int[] tmp = new int[size]; 
       for (int i = 0; i < size; i++) {
        tmp[i] = s.pop();
       }
       s.push(x);
       for (int i = size - 1; i >= 0; i--) {
        s.push(tmp[i]);
       }
    }
    
    public int pop() {
        return s.pop();
        
    }
    
    public int peek() {
        return s.peek();
        
    }
    
    public boolean empty() {
        return s.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */