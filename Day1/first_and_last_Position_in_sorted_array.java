class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];

        int ans = -1 ; 
        int low = 0 ;
        int high = nums.length - 1;

        while( low<= high){
            int mid = low + ( high-low)/2;

            if( target == nums[mid]){
                ans = mid ;
                high = mid-1;
            }
            else if( target>nums[mid]){
                low = mid+ 1;
            }
            else{
                high= mid-1;
            }
        }
        arr[0] = ans;

         ans = -1 ; 
         low = 0 ;
         high = nums.length - 1;

        while( low<= high){
            int mid = low + ( high-low)/2;

            if( target == nums[mid]){
                ans = mid ; 
                low = mid+1 ;
            }
            else if( target<nums[mid]){
                high = mid- 1;
            }
            else{
                low = mid+1;
            }
        }
        arr[1] = ans;
        return arr;
    }
}