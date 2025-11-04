class Solution {
    PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
        (a, b) -> {
            // First: higher frequency first
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            // Second: if same frequency, higher key first
            return b.getKey() - a.getKey();
        }
    );
    public void addinlist(Map<Integer,Integer> map, int x, ArrayList<Integer> list) {
    int sum = 0;
    for (int j = 0; j < x; j++) {
        Map.Entry<Integer, Integer> tempmap = queue.poll();
        if (tempmap == null) break; // prevent NullPointerException
        sum += tempmap.getKey() * tempmap.getValue();
    }
    list.add(sum);
}
    public int[] findXSum(int[] nums, int k, int x) {
        ArrayList<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();

        //initialize the window.
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        queue.addAll(map.entrySet());
        addinlist(map,x,list);
        int left=0;
        int right=k;

        for(right=k;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0){
                map.remove(nums[left]);
            }
            left++;
            queue.clear();
            queue.addAll(map.entrySet());
            addinlist(map,x,list);

        }
        int []ans=new int[list.size()];
        for(int index=0;index<list.size();index++){
            ans[index]=list.get(index);
        }
        return ans;


    }
}
