class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,1)+1);
        }

        List<Integer> list = new ArrayList(map.values());
        Collections.sort(list);
        int i = 0;
        while(i < result.length) {
            int freq = list.get(list.size()-k);
            for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                if(entry.getValue() == freq) {
                    result[i++] = entry.getKey();
                    k--;
                }
            }         
        }
        return result;
        
    }
}