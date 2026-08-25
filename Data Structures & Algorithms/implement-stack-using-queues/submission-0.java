class MyStack {
    Queue<Integer> queue= new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public MyStack() {
        
    }
    public void push(int x) { 
        queue2.add(x);
        while(!queue.isEmpty()){
            queue2.add(queue.peek());
            queue.remove();
        }
        Queue<Integer> q = queue ;
        queue = queue2 ;
        queue2 = q ;
    }
    public int pop() {
        if (queue.isEmpty()){
            return -1;
        }
        return queue.remove();
    }
    public int top() {
        if (queue.isEmpty()){
            return -1 ;
        }
        return queue.peek();
    }
    public boolean empty() {
        if(queue.isEmpty()){
            return true ;
        }
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