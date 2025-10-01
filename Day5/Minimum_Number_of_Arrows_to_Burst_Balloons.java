class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort( points, (a,b) -> Integer.compare(a[0] , b[0] ) );
        int prevStart = points[0][0];
        int prevEnd = points[0][1];
        int c = 1 ;
        for( int i = 1 ; i< points.length ; i++){
            int currStart = points[i][0];
            int currEnd = points[i][1];

            if( currStart <= prevEnd){
                prevStart = Math.max( prevStart , currStart);
                prevEnd = Math.min( prevEnd  , currEnd);
            }
            else {
                c++;
                prevStart = currStart;
                prevEnd = currEnd ;

            }
        }
        return c ;
    }
}