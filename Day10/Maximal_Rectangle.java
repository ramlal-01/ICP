class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int pref[][] = new int[n][m];
        for( int j=0 ; j<m ; j++){
            int sum =0 ;
            for( int i=0 ; i<n; i++){
                sum+= matrix[i][j]-'0';
                if( matrix[i][j]-'0'==0) sum=0;
                pref[i][j]= sum;
            }
        }
        int max =0;
        for( int i=0 ; i<n ; i++){
            max = Math.max( max, largestRectangleArea(pref[i]));
        }
        return max;
    }
    public int largestRectangleArea(int[] heights) {
        int nse[] = nse(heights);
        int pse[] = pse(heights);
        int sum =0 ;
        int max =0;
        int n = heights.length;
        for( int i=0 ; i<n ; i++){
            sum= heights[i]*( nse[i]-pse[i]-1);
            max = Math.max(max,sum);
        }
        return max;
    }

    public int[] nse( int arr[]){
        int n = arr.length; 
        int res[] = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for( int i=n-1; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i] ){
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] pse( int arr[]){
        int n = arr.length; 
        int res[] = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for( int i=0; i<n ; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i] ){
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return res;
    }
}