class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int num:nums){
            if(!result.containsKey(num)){
                result.put(num,1);
            }
            else{
                int current=result.get(num);
                result.put(num,current+1);
            }
        }
        List<Integer> uniqueNums = new ArrayList<>(result.keySet());
        Collections.sort(uniqueNums, (a, b) -> result.get(b) - result.get(a));
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = uniqueNums.get(i);
        }
        return topK;
    }
}