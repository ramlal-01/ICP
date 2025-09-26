class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort( points , (a,b) -> Integer.compare( a[0] , b[0]));

        int shots = 1 ;
        int pS = points[0][0];
        int pE = points[0][1];

        for( int i =1 ; i< points.length ; i++){
            int cS = points[i][0];
            int cE = points[i][1];

            if( cS <= pE){
                pS = Math.max( pS , cS);
                pE = Math.min( pE , cE);
            }
            else{
                shots++;
                pS = cS;
                pE = cE;
            }
        }
        return shots;
    }
}