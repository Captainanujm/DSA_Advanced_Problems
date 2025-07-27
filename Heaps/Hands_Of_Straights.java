//Using priority queue and hashmap 

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Integer>pqueue=new PriorityQueue<>();
        for(int num:hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        pqueue.addAll(map.keySet());
        while(!pqueue.isEmpty()){
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<groupSize;i++){
              //if list has no element then there is no comparison.
                if(i==0){
                    int num=pqueue.poll();
                    list.add(num);
                    map.put(num,map.get(num)-1);
                    if(map.get(num)==0){
                        map.remove(num);
                    }
                }
                else{
                  //condition to check whether the element in queue is continuous or not.
                    if(!pqueue.isEmpty()&&(list.get(list.size()-1)+1==pqueue.peek())){
                        int num=pqueue.poll();
                        list.add(num);
                        map.put(num,map.get(num)-1);
                        if(map.get(num)==0){
                            map.remove(num);
                        }
                    }else{
                        return false;
                    }
                }
            }
          //adding element is exists in map to ensure its usage in next group.
            for(int ele:list){
                if(map.containsKey(ele)){
                    pqueue.add(ele);
                }
            }
        }
        return true;
    }
}
