class MedianFinder {
      private PriorityQueue<Integer>leftmaxheap;
      private PriorityQueue<Integer>rightminheap;
    public MedianFinder() {
      leftmaxheap=new PriorityQueue<>(Collections.reverseOrder());
      rightminheap=new PriorityQueue<>();  
    }
    
    public void addNum(int num) {
        if(leftmaxheap.isEmpty()||num<leftmaxheap.peek()){
            leftmaxheap.add(num);
        }
        else{
            rightminheap.add(num);
        }
        if(Math.abs(leftmaxheap.size()-rightminheap.size())>1){
            rightminheap.add(leftmaxheap.poll());
        }
        else if(leftmaxheap.size()<rightminheap.size()){
            leftmaxheap.add(rightminheap.poll());
        }
    }
    
    public double findMedian() {
        if(leftmaxheap.size()==rightminheap.size()){
            return (double)(leftmaxheap.peek()+rightminheap.peek())/2;
        }
        return leftmaxheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
