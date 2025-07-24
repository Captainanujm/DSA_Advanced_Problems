//Kuch important points-:

// Use of priority queue to track the freq of maximum element.
// Add the n+1 elements because to create the time gap of 'n' we require n+1 elements.
// last me total time me add krenge toh track krenge ki aage elements bche hain ya ni , queue empty hai ya ni..


class Solution {
    public int leastInterval(char[] tasks, int n) {
         PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
         HashMap<Character,Integer>map=new HashMap<>();
         for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         pqueue.addAll(map.values());
         int time=0;
         while(!pqueue.isEmpty()){
            int temptime=0;
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(!pqueue.isEmpty()){
                    list.add(pqueue.poll());
                }else{
                    temptime++;
                }
            }
           //first add the remains in priority queue to ensure tasks are remaining for future
            for(int j=0;j<list.size();j++){
                int ele=list.get(j);
                ele=ele-1;
                if(ele>0){
                    pqueue.add(ele);
                }
            }
//     addition of totaltime with some edge cases listed below..
            if(!pqueue.isEmpty()){
                 time=time+list.size()+temptime;
            }else{
              //if queue is empty then no tasks left then simply add list size..
                time=time+list.size();
            }
           
         }
         return time;
    }
}
