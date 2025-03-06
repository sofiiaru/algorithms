class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combine(list, new ArrayList<Integer>(), 1, n, k);
        return list;        
    }

    public void combine(List<List<Integer>> list, List<Integer> currentComb, int start, int n, int k) {
        if( k == 0) {
            list.add(new ArrayList<Integer>(currentComb));
            return;
        }

        for(int i = start; i <= n; i++) {
            currentComb.add(i);
            combine(list,currentComb, i+1, n, k-1);
            currentComb.remove(currentComb.size()-1);
        }

    }
}