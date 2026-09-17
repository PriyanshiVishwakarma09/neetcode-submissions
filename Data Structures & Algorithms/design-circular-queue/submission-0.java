class MyCircularQueue {
    ArrayList<Integer> list ;
    int k ;
    public MyCircularQueue(int k) {
        list = new ArrayList<>(k);
        this.k = k ;
    }
    
    public boolean enQueue(int value) {
        if(list.size() >= k){
            return false;
        }
        else{
            list.add(value);
        }
            return true ;
    }
    
    public boolean deQueue() {
        if(!list.isEmpty()){
            list.remove(0);
            return true ;
        }
        return false ;
        
    }
    
    public int Front() {
        if(list.isEmpty()){
            return -1; 
        }
        return list.get(0);
    }
    
    public int Rear() {
        if(list.isEmpty()){
            return -1; 
        }
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty() {
        if(list.isEmpty()){
            return true ;
        }
        return false ;
    }
    
    public boolean isFull() {
        if(list.size() == k){
            return true ;
        }
        return false ;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */