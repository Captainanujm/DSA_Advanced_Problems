// User function Template for Java

class Solution {
    
    static ArrayList<Integer>heap=new ArrayList<>();
    public static void min_heapify(int index){
        int smallest=index;
        if(index*2+1<heap.size()&&heap.get(index*2+1)<heap.get(index)){
            smallest=index*2+1;
        }
        if(index*2+2<heap.size()&&heap.get(index*2+2)<heap.get(smallest)){
            smallest=index*2+2;
        }
        if(smallest!=index){
            int temp=heap.get(smallest);
         heap.set(smallest,heap.get(index));
         heap.set(index,temp);
         min_heapify(smallest);
        
        }
         
    }
    public static void Insert_in_HEAP(int value){
        heap.add(value);
        int current=heap.size()-1;
        while (current > 0) {
    int parent = (current - 1) / 2;
    if (heap.get(parent) > heap.get(current)) {
        int temp = heap.get(parent);
        heap.set(parent, heap.get(current));
        heap.set(current, temp);
        current = parent;
    } else {
        break;
    }
}

        
    }
    public static int extract_Min(){
        int min=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
       heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            min_heapify(0);
        }
        return min;
    }
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        heap.clear();
        int minimum=0;
        for(int i=0;i<arr.length;i++){
            Insert_in_HEAP(arr[i]);
        }
        for(int i=0;i<k;i++){
             minimum=extract_Min();
        }
       return minimum;
        
    }
}

