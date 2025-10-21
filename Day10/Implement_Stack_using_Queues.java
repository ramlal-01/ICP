class MyStack {
    private ArrayDeque<Integer> que;

    public MyStack() {
         que = new ArrayDeque<>();
    }
    
    public void push(int x) {
        que.offerLast(x);
    }
    
    public int pop() {
        return que.pollLast();
    }
    
    public int top() {
        return que.peekLast();
    }
    
    public boolean empty() {
        if( que.isEmpty()) return true ;
        return false ;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */