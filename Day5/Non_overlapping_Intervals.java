class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort( intervals , (a,b)-> Integer.compare( a[1] , b[1]));

        int pS = intervals[0][0];
        int pE = intervals[0][1];
        int c = 0 ;
        for( int i = 1 ; i< intervals.length ;i++){
            int cS = intervals[i][0];
            int cE = intervals[i][1];
            if( cS < pE ){
                c++;
                intervals[i][0] = pS ;
                intervals[i][1] = pE ;
            }
            else {
                pS = cS ;
                pE = cE ;
            }
        }

        return c ;
    }
}