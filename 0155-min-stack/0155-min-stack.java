class MinStack {
Stack <Integer> normalstack;//declarre
Stack <Integer> minstack;
    public MinStack() {
        //constructor-iska naam class ka naam same hai
        normalstack=new Stack<>();//initialize
        minstack=new Stack<>();
    }
    
    public void push(int value) {
        normalstack.push(value);
        if(minstack.isEmpty()||minstack.peek()>=value){
           minstack.push(value);
        }
    }
    
    public void pop() {
        int temp=normalstack.pop();
        if(temp==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        return normalstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */