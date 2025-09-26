class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for( int i = 0 ; i< k ; i++){
            while( !dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        // System.out.println(dq);
        ArrayList<Integer> list = new ArrayList<>();
        
        for( int i = k ; i<nums.length ; i++){
            list.add( nums[dq.peekFirst()]);

            while( !dq.isEmpty() && dq.peekFirst()<= i-k){
                dq.pollFirst();
            }

            while( !dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

        }
        list.add( nums[dq.peekFirst()]);
        int arr[] = new int[list.size()];
        int ind =0;
        for( int ele : list){
            arr[ind++]  = ele;
        }
        return arr;
    }
}