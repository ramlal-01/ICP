class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0 ;
        int j = 0 ;
        int zeroes =  0 ;
        int max = 0 ;
        while( j<nums.length){
            if( nums[j]==0) zeroes++;

            if( zeroes>k ){
                if( nums[i]==0){
                    zeroes--;
                }
                i++;
            }
            max = Math.max( max , j-i+1);
            j++;
        }
        return max;
    }
}