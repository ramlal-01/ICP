class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m-1 ;
        int h = n-1;

        int k  = m+n-1;

        while(l >= 0 && h >= 0){
            if(nums1[l] > nums2[h]){
                nums1[k] = nums1[l];
                l--;
            } else {
                nums1[k] = nums2[h];
                h--;
            }
            k--;
        }

        while(h >= 0){
            nums1[k] = nums2[h];
            k--;
            h--;
        }

        
    }
}