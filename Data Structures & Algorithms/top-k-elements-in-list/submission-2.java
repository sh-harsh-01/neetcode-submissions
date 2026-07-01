class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll();
        }

        return arr;
    }
}
