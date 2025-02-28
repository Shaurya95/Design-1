class MinStack {
    int min; 
    Stack<Integer> s;

    public MinStack() {
        s = new Stack();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if (val <= min) {
             s.push(min);
              min = val;            
        }
        s.push(val);
       
    }
    
    public void pop() {
        int popped = s.pop();
        if (popped == min) {            
            min = s.pop();          
        }
        
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}